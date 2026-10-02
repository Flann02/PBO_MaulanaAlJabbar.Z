package Quiz1;

public class Generator {
    private int daya;
    private int voltase;
    
    public Generator(int dy, int volt){
        this.daya = dy;
        this.voltase = volt;
    }

    public void setDaya(int dy){
        this.daya = dy;
    }

    public  int getDaya(){
        return daya;
    }

    public void setVoltase(int volt) {
        this.voltase = volt;
    }

    public int getVoltase() {
        return voltase;
    }
}
