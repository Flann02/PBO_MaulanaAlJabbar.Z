package P6.Percobaan1;

public class Manager extends Karyawan{
    private double tunjungan;
    private String bagian;
    private Staff st[];

    public void setTunjangan(double tunjungan) {
        this.tunjungan = tunjungan;
    }

    public double getTunjungan() {
        return tunjungan;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public String getBagian() {
        return bagian;
    }

    public void setStaff(Staff st[]) {
        this.st = st;
    }

    public void viewSaff(){
        int i;
        System.out.println("------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("------------------");
    }

    public void lihatInfo(){
        System.out.println("Manager :" + this.getBagian());
        System.out.println("NIP :" +getNip());
        System.out.println("Nama :" + this.getNama());
        System.out.println("Golongan" + this.getGolongan());
        System.out.printf("Tujungan :%.0f\n", this.getTunjungan());
        System.out.printf("Gaji :%.0f\n", getGaji());
        System.out.println("Bagian :" + getBagian());
        this.viewSaff();
    }

    public double getGaji(){
        return super.getGaji() + tunjungan;
    }
}
