package Quiz2;

public class Main {
    public static void main(String[] args) {
        Monster mon = new Monster("T-Rex", 100);
        Robot rbt = new Robot("Maccross", 90);

        mon.hancurkan(new Bangunan());
        rbt.hancurkan(new Tiang());
    }
}
