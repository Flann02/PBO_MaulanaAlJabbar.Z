package P9.Tugas;

public class Main {
    public static void main(String[] args) {
        Keledai keledai = new Keledai("keledai", 4, "hehehe", "Abu-abu");
        Gorila gorila = new Gorila("Gulali", 4, "Hauum", "Hitam manis");
        Singa singa = new Singa("Cingacing", 4, "Roaar", "Coklat");

        keledai.diplayData();
        System.out.println();
        gorila.diplayData();
        System.out.println();
        singa.diplayData();
    }
}
