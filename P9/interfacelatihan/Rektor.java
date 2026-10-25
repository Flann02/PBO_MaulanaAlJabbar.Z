package P9.interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(Icumlaude mahasiswaCumlaude){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Silahkan perkenalkan diri anda.");

        mahasiswaCumlaude.lulus();
        mahasiswaCumlaude.meraihIPKTinggi();

        System.out.println("--------------------------------------------------");
    }

    public void beriSeritifikatMawapres(IBerprestasi mahasiswBerprestasi){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");

        mahasiswBerprestasi.menjuaraiKompetisi();
        mahasiswBerprestasi.membuatPublikasiIlmiah();

        System.out.println("----------------------------------------------------");
    }
}
