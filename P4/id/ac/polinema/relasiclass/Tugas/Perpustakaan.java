package id.ac.polinema.relasiclass.Tugas;

public class Perpustakaan {
    private String nama;
    private Rak[] arrayRak; 

    public Perpustakaan(String nama, int jumlahRak) {
        this.nama = nama;
        this.arrayRak = new Rak[jumlahRak];
        this.initRak();
    }

    private void initRak() {
        for (int i = 0; i < arrayRak.length; i++) {
            this.arrayRak[i] = new Rak("R" + (i + 1)); 
        }
    }

    public void letakkanBuku(Buku buku, int nomorRak) {
        this.arrayRak[nomorRak - 1].setBuku(buku);
    }

    public void prosesPeminjaman(Anggota anggota, String judulBuku) {
        for (Rak rak : arrayRak) {
            Buku buku = rak.getBuku();
            if (buku != null && buku.getJudul().equalsIgnoreCase(judulBuku)) {
                System.out.println(anggota.getNama() + " (" + anggota.getNoAnggota()
                        + ") meminjam buku \"" + buku.getJudul() + "\" dari " + rak.getKode());
                rak.setBuku(null); // buku keluar dari rak karena sedang dipinjam
                return;
            }
        }
        System.out.println("Buku \"" + judulBuku + "\" tidak ditemukan / sedang dipinjam.");
    }

    public String infoRak() {
        String info = "Kondisi rak di Perpustakaan " + nama + ":\n";
        for (Rak rak : arrayRak) {
            info += rak.info() + "\n";
        }
        return info;
    }
}
