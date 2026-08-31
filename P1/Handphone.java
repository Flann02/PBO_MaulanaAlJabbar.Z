package P1;

public class Handphone {
    private String merk;
    private int kapasitasBatrei;
    
    public void setMerk(String merkName){
        merk = merkName;
    }

    public void setKapasitasBatrei(int kapasitas){
        kapasitasBatrei = kapasitas;
    }

    public void chargingHP(int durasi){
        if (kapasitasBatrei > 100) {
            System.out.println("Batrei penuh");
        }else {
            System.out.println("HP dicas selama " + durasi + " menit. Baterai saat ini: " + kapasitasBatrei + "%");
        }
    }

    public void setInfo(){
        System.out.println("Merk HP :" + merk);
        System.out.println("Kapasitas Baterai :" + kapasitasBatrei + "%");
    }
}
