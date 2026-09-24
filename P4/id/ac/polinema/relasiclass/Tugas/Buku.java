package id.ac.polinema.relasiclass.Tugas;

public class Buku {
    private String judul;
    private String isbn;

    public Buku(String judul, String isbn) {
        this.judul = judul;
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getIsbn() {
        return isbn;
    }

    public String info() {
        return "Judul: " + judul + " | ISBN: " + isbn;
    }
}

