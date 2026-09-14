package P2;

public class Barang {
    public String namaBrg, jenisBrg;
    public int stok;

    public void tampilBarang(){
        System.out.println("Nama Barang :" + namaBrg);
        System.out.println("Jenis Barang :" + jenisBrg);
        System.out.println("Stok :" + stok);
    }

    //Method dengan argumen dan nilai balik (return)
    public int tambakStok(int brgMasuk){
        int stokBaru = brgMasuk + stok;
        return stokBaru;    
    }
}