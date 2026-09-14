package P2;

public class testBaarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        //Menampilkan dan mengisi argumne untuk  menambahkan stok barang
        System.out.println("Stok baru adalah : " + brg1.tambakStok(20));
    }
}