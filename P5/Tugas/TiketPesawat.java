package P5.Tugas;

public class TiketPesawat extends Tiket{
    protected String masKapai;
    protected int beratBagasi;

    public TiketPesawat(){

    }

    public TiketPesawat(String kt, String np, String asal, String tujuan, int hargaDasar, String masKapai, int beratBagasi){
        super(kt, np, asal, tujuan, hargaDasar);
        this.masKapai = masKapai;
        this.beratBagasi = beratBagasi;
    }

    public int hitungBiayaBagasi() {
    int biaya = 0;
    if (beratBagasi > 20) {
        biaya = (beratBagasi - 20) * 50000;
    }
    return biaya;
}

    public void tampilPesawat(){
        super.tampilTiket();
        System.out.println("MasKapai        :" + masKapai);
        System.out.println("Berat Bagasi    :" + beratBagasi);
        System.out.println("Biaya Bagasi    :" + hitungBiayaBagasi());
    }
}
