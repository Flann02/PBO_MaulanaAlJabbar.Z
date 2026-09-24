package id.ac.polinema.relasiclass.Tugas;

public class Anggota {
    private String noAnggota;
    private String nama;

    public Anggota(String noAnggota, String nama) {
        this.noAnggota = noAnggota;
        this.nama = nama;
    }

    public String getNoAnggota() {
        return noAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        return "No. Anggota: " + noAnggota + " | Nama: " + nama;
    }
}
