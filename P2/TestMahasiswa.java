package P2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = 101;
        mhs.nama = "Lestari";
        mhs.alamat = "Jl. Vinolia No 1A";
        mhs.kelas = "1A";
        mhs.tampilkanBiodata();

        //Menambahkan object baru
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Budi";
        mhs2.alamat = "Jl. Merdeka No 2B";
        mhs2.kelas = "1B";
        mhs2.tampilkanBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 103;
        mhs3.nama = "Siti";
        mhs3.alamat = "Jl. Diponegoro No 3C";
        mhs3.kelas = "1C";
        mhs3.tampilkanBiodata();
    }
}