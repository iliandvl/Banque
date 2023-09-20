public class Main {
    public static void main(String[] args) {
        Compte compte = new Compte();
        compte.montant = 12.5;
        compte.depot(3);
        compte.retrait(16);
    }
}