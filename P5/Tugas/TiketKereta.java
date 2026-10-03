package P5.Tugas;

public class TiketKereta extends Tiket{
    protected int nomorGerbong;
    protected String nomorKursi;

    public TiketKereta(){

    }

    public TiketKereta(String kt, String np, String asal, String tujuan, int hargaDasar, int nG, String nK){
        super(kt, np, asal, tujuan, hargaDasar);
        this.nomorGerbong = nG;
        this.nomorKursi = nK;
    }

    public void tampilKereta(){
        System.out.println("========== Tiket Kereta ==========");
        super.tampilTiket();
        System.out.println("Nomor Gerbong   :" + nomorGerbong);
        System.out.println("Nomor Kursi     :" + nomorKursi);
        System.out.println("Total Bayar     :" + hargaDasar);
    }
}
