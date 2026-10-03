package P5.Tugas;

public class TiketInternasional extends  TiketPesawat{
    protected String nomorPaspor;
    protected int asuransi;
    
    public TiketInternasional(){

    }

    public TiketInternasional(String kt, String np, String asal, String tujuan, int hargaDasar, String masKapai, int beratBagasi, String nP, int asuransi){
        super(kt, nP, asal, tujuan, hargaDasar, masKapai, beratBagasi);
        this.nomorPaspor = np;
        this.asuransi = asuransi;
    }

    public void tampilInternasional(){
        System.out.println("========== Tiket Pesawat Internasional ==========");
        super.tampilPesawat();
        System.out.println("Nomor Paspor    :" + nomorPaspor);
        System.out.println("Asurannsi       :" + asuransi);
        System.out.println("Total Bayar     :" + (super.hargaDasar + super.hitungBiayaBagasi() + asuransi));
    }
}
