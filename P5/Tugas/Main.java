package P5.Tugas;

public class Main {
    public static void main(String[] args) {
        TiketKereta KR = new TiketKereta("KA-001", "Andi", "Malang", "Jakarta", 350000, 3, "12A");
        KR.tampilKereta();

        System.out.println();

        TiketDomesik TD = new TiketDomesik("GA-102", "Sinta", "Surabaya", "Denpasar", 900000, "Garuda Indonesia", 25, 75000);
        TD.tampilDomestik();

        System.out.println();

        TiketInternasional TI = new TiketInternasional("SQ-205", "C1234567", "Jakarta", "Singapura", 2500000, "Singapure Airlane", 20, "Budi", 150000);
        TI.tampilInternasional();
    }
}
