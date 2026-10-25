package P9.Tugas;

public class Gorila extends Binatang implements IKarnivora, IHerbivora{
    private String suara, warnaBulu;

    public Gorila(String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Jenis : Karnivora + Herbivora");
        System.out.println("Makanan : Daging + Tumbuhan");
    }

    @Override
    public void displayBinatang() {
        super.displayBinatang();
        System.out.println("Suara :" + suara);
        System.out.println("Warna bulu :" + warnaBulu);
    }

    public void diplayData(){
        displayMakan();
        displayBinatang();
    }
}
