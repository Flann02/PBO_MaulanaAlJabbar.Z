package id.ac.polinema.relasiclass.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Perpustakaan membuat 5 Rak sendiri (Composition)
        Perpustakaan perpus = new Perpustakaan("Polinema", 5);

        // Buku dibuat di luar Rak, lalu diletakkan (Aggregation)
        Buku b1 = new Buku("Pemrograman Berorientasi Objek", "978-1-1111");
        Buku b2 = new Buku("Struktur Data", "978-2-2222");
        Buku b3 = new Buku("Basis Data", "978-3-3333");

        perpus.letakkanBuku(b1, 1);
        perpus.letakkanBuku(b2, 2);
        perpus.letakkanBuku(b3, 3);

        System.out.println(perpus.infoRak());

        // Anggota dibuat, lalu HANYA dipinjamkan sesaat lewat parameter (Dependency)
        Anggota anggota = new Anggota("A001", "Budi Santoso");
        perpus.prosesPeminjaman(anggota, "Struktur Data");

        System.out.println();
        System.out.println(perpus.infoRak());

        // Coba pinjam buku yang sama sekali lagi -> tidak ditemukan (sudah keluar dari rak)
        perpus.prosesPeminjaman(anggota, "Struktur Data");
    }
}
