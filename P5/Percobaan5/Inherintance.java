package P5.Percobaan5;

public class Inherintance {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.nama="Vivin";
        M.alamat="Jl. Vinola";
        M.umur = 25;
        M.jk = "Perempuan";
        M.gaji = 300000;
        M.tunjangan = 1000000;
        M.tampilDataManager();

        System.out.println();

        Staff S = new Staff();
        S.nama = "Lestari";
        S.alamat = "Malang";
        S.umur = 25;
        S.jk = "Perempuan";
        S.gaji = 2000000;
        S.lembur = 500000;
        S.potongan = 250000;
        S.tampilDataStaff();
    }
}
