package P10.Tugas;

public abstract class Zombie implements Destroyble{
    protected int health;
    protected int level;

    public abstract void heal();

    public abstract void destroyed();

    public String getZombieInfo(){
        return "Health =" + health + "\n" + "Level =" + level + "\n";
    } 
}
