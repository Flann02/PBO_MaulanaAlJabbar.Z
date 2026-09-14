package P2;

public class Peminjaman {
    public int id, hargaSewa, lamaSewa;
    public String namaGame, namaMember;

    public int hitungTotalBayar(){
        int totalBayar = hargaSewa * lamaSewa;
        return totalBayar;
    }
    
    public void tampilData(){
        System.out.println("ID Peminjaman :" + id);
        System.out.println("Nama Game :" + namaGame);
        System.out.println("Nama Member :" + namaMember);
        System.out.println("Harga Sewa :" + hargaSewa);
        System.out.println("Lama Sewa :" + lamaSewa);
        System.out.println("Total Bayar :" + hitungTotalBayar());
    }
}
