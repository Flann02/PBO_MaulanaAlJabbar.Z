package P5.Tugas;

public class TiketDomesik extends TiketPesawat{
    protected int pajakBandara;

    public TiketDomesik(){

    }

    public TiketDomesik(String kt, String np, String asal, String tujuan, int hargaDasar, String masKapai, int beratBagasi, int pajak){
        super(kt, np, asal, tujuan, hargaDasar, masKapai, beratBagasi);
        this.pajakBandara = pajak;
    }

    public void tampilDomestik(){
        System.out.println("========== Tiket Pesawat Domestik ==========");
        super.tampilPesawat();
        System.out.println("Pajak Bandara   :" + pajakBandara);
        System.out.println("Total Bayar     :" + (super.hargaDasar + super.hitungBiayaBagasi() + pajakBandara));
    }
}
