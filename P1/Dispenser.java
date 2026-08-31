package P1;

public class Dispenser {
    private int volAir;
    private String merk;

    public void isiGalon(int volAwal, String merk){
        this.merk = merk;
        this.volAir = volAwal;
    }

    public void ambilAir(int jmlhAir){
        if (volAir >= jmlhAir) {
            volAir -= jmlhAir;
            System.out.println("Mengambil air sebanyak " + jmlhAir + "ml");
        }else {
            System.out.println("Tidak mengambil air");
        }
    }

    public void setInfo(){
        System.out.println("Merk Dispenser :" + merk);
        System.out.println("Volume Air :" + volAir + "ml");
    }
}
