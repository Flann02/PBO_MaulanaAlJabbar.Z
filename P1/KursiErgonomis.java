package P1;

public class KursiErgonomis extends Kursi {
    private int sudutSandaran;
    private int tinggiKursi;

    public void setSudutSandaran(int sudut){
        if (sudut >= 90 && sudut <=140) {
            this.sudutSandaran = sudut;
            System.out.println(sudutSandaran + "derajat");
        }else {
            this.sudutSandaran = 90;
        }
    }

    public void setTinggiKursi(int tinggi){
        if (tinggi >= 40 && tinggi <= 60) {
            this.tinggiKursi = tinggi;
            System.out.println(tinggiKursi + "cm");
        }else {
            this.tinggiKursi = 40;
        }
    }

    @Override
    public void setInfo(){
        super.setInfo();
        System.out.println("Sudut Sandaran :" + sudutSandaran + "derajat");
        System.out.println("Tinggi Kursi :" + tinggiKursi + "cm");
    }
}
