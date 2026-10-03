package P5.Percobaan3;

public class Tabung extends Bangun{
    protected int t;

    public void setSuperPhi(double phi){
        super.phi = phi;
    }

    public void SetSuperR(int r){
        super.r = r;
    }

    public void setT(int t){
        this.t = t;
    }

    public void volume(){
        System.out.println("Volume Tabung adalah :" + (super.phi * super.r * super.r * this.t));
    }
}
