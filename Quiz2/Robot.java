package Quiz2;

public class Robot extends Karakter{
    public int armor;

    public Robot(String nama, int armor){
        this.nama = nama;
        this.armor = armor;
    }

    @Override
    public void hancurkan(DestroyAble da) {
        System.out.println("Tiang telah dihancurkan! oleh " + nama);
    }
}
