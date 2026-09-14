package P2;

public class Barang1 {
    public String kode, namaBrg;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        int hargaJual = (int)(hargaDasar - (diskon * hargaDasar));
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode Barang :" + kode);
        System.out.println("Nama Barang :" + namaBrg);
        System.out.println("Harga Dasar :" + hargaDasar);
        System.out.println("Diskon :" + diskon);
        System.out.println("Harga Jual :" + hitungHargaJual());
    }
}
