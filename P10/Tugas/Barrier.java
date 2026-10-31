package P10.Tugas;

public class Barrier implements Destroyble{
    private int strength;

    public Barrier(int strength){
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy(){
        strength = strength*90/100;
    }

    @Override
    public void destroyed() {
        destroy();
    }

    public String getBarrierInfo(){
        return "Barrier strength =" + strength + "\n";
    }
}
