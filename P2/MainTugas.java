package P2;

public class MainTugas {
    public static void main(String[] args) {
        //inisiasi Class peminjaman
        System.out.println("\t===Data Peminjaman Game===");
        System.out.println();
        Peminjaman p1 = new Peminjaman();
        p1.id = 101;
        p1.namaMember = "Andi";
        p1.namaGame = "Elder Ring";
        p1.lamaSewa = 3;
        p1.hargaSewa = 5000;
        p1.tampilData();
        System.out.println();

        //Inisasi Class Lingkaran
        System.out.println("\t===Class Lingkaran===");
        System.out.println();
        Lingkaran L1 = new Lingkaran();
        L1.phi = 3.14;
        L1.r = 15;
        System.out.println("Luas Lingkaran :" + L1.hitungLuas());
        System.out.println("Keliling Lingkaran :" + L1.hitungKeliling());
        System.out.println();

        //Inisiasi Class Barang
        System.out.println("\t===Class Barang===");
        System.out.println();
        Barang1 br1 = new Barang1();
        br1.kode = "B001";
        br1.namaBrg = "Buku Tulis";
        br1.hargaDasar = 8000;
        br1.diskon = 0.2f;
        br1.tampilData();
    }
}
