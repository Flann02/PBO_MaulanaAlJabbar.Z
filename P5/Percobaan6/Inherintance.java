package P5.Percobaan6;

public class Inherintance {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Laki-laki", 20, 20000000, 250000, 200000, "2A", 100000);
        ST.tampilkanStaffTetap();

        System.out.println();

        StaffHarian SH = new StaffHarian("Indah", "Malang", "PErempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}
