package P1;

public class Kursi {
    private String material;
    private int tinggi;
    
    public void setMaterial(String materialType){
        material = materialType;
    }

    public void setTinggi(int tinggiKrusi){
        tinggi = tinggiKrusi;
    }

    public void setInfo(){
        System.out.println("Material Kursi :" + material);
        System.out.println("Tinggi Kursi :" + tinggi + "cm");
    }
}
