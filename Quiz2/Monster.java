package Quiz2;

public class Monster extends Karakter{
    public int tenaga;

    public Monster(String nama, int tenaga){
        this.nama = nama;
        this.tenaga = tenaga;
    }

    @Override
    public void hancurkan(DestroyAble da) {
        System.out.println("Gedung telah dihancurkan! oleh " + nama);
    }
}
