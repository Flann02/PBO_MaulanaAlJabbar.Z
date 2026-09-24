package id.ac.polinema.relasiclass.Tugas;

public class Rak {
    private String kode;
    private Buku buku; // boleh null -> rak kosong

    public Rak(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    // <-- Buku diterima dari luar, TIDAK dibuat dengan new di dalam Rak -> Aggregation
    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public String info() {
        String info = "Rak " + kode + ": ";
        if (this.buku != null) { // guard clause, sama seperti Kursi pada Percobaan 4
            info += buku.info();
        } else {
            info += "(kosong)";
        }
        return info;
    }
}
