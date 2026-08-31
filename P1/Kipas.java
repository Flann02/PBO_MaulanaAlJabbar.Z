package P1;

public class Kipas {
    private String merk;
    private int kecepatan;

    public void setMerk(String merkKopas){
        merk = merkKopas;
    }

    public void setKecepatan(int level){
        if (level >= 0 && level <= 3) {
            this.kecepatan = level;
            System.out.println("Kipas di atur dengan kecepatan " + kecepatan);
        }else {
            System.out.println("Kipas mati");
        }
    }

    public void setInfo(){
        System.out.println("Merk Kipas :" + merk);
        System.out.println("Kecepatan Kipas :" + kecepatan);
    }
}
