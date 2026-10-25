package P9.interfacelatihan;

public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");


        
        pakRektor.beriSeritifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSeritifikatMawapres(masterCumlaude);
    }
}
