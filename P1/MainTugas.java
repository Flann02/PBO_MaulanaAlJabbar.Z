package P1;

public class MainTugas {
    public static void main(String[] args) {

        System.out.println("class Hp");
        Handphone hp = new Handphone();
        hp.setMerk("Samsung");
        hp.setKapasitasBatrei(30);
        hp.chargingHP(15);
        hp.setInfo();

        System.out.println();

        System.out.println("class Hp Gaming");
        HPGaming hpg = new HPGaming();
        hpg.setMerk("Asus");
        hpg.setKapasitasBatrei(40);
        hpg.chargingHP(60);
        hpg.setCooler("Liquid Cooling");
        hpg.setGamingMode(true);
        hpg.setInfo();

        System.out.println();

        System.out.println("class Kursi");
        Kursi kursi = new Kursi();
        kursi.setMaterial("Kayu");
        kursi.setTinggi(100);
        kursi.setInfo();

        System.out.println();

        System.out.println("class Kursi Ergonomis");
        KursiErgonomis ergonomis = new KursiErgonomis();
        ergonomis.setMaterial("Kulit");
        ergonomis.setTinggi(100);
        ergonomis.setSudutSandaran(120);
        ergonomis.setTinggiKursi(50);
        ergonomis.setInfo();

        System.out.println();

        System.out.println("class Dispenser");
        Dispenser dispenser = new Dispenser();
        dispenser.isiGalon(2000, "Aqua");
        dispenser.ambilAir(500);
        dispenser.setInfo();

        System.out.println();

        System.out.println("class Kipas");
        Kipas kipas = new Kipas();
        kipas.setMerk("Miyako");
        kipas.setKecepatan(3);
        kipas.setInfo();

    }
}
