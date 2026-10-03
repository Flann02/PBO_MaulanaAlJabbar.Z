package P5.Tugas;

public class Tiket {
    protected  String kodeTiket, namaPenumpang, asal, tujuan;
    protected int hargaDasar;

    public Tiket(){

    }

    public Tiket(String kt, String np, String asal, String tujuan, int hargaDasar){
        this.kodeTiket = kt;
        this.namaPenumpang = np;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    public void tampilTiket(){
        System.out.println("Kode Tiket      :" + kodeTiket);
        System.out.println("Nama Penumpang  :" + namaPenumpang);
        System.out.println("Rute            :" + asal + " - " + tujuan);
        System.out.println("Harga Dasar     :"  + hargaDasar);
    }
}
