package Quiz1;

public class SpaceShuttle {
    private String kode;
    private int berat;
    private Roket roketUtama;
    private Generator generatorUtama;

    public SpaceShuttle(String kd, int brt, Roket rkt, Generator gnt){
        this.kode = kd;
        this.berat = brt;
        this.roketUtama = rkt;
        this.generatorUtama = gnt;
    }

    public void setKode(String kd){
        this.kode = kd;
    }

    public String getKode(){
        return kode;
    }

    public void setBerat(int brt) {
        this.berat = brt;
    }

    public int getberat() {
        return berat;
    }

    public void setRoket(Roket rkt){
        this.roketUtama = rkt;
    }

    public Roket getRoketUtama() {
        return roketUtama;
    }

    public void setGenarator(Generator gnt){
        this.generatorUtama = gnt;
    }

    public Generator getGeneratorUtama() {
        return generatorUtama;
    }

}
