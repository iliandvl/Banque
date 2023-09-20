public class Compte {
    Titulaire titulaire;
    Banque banque;
    String numCompte;
    int motDePasse;
    double montant;
    int numCarte;
    public void depot(double dep){
        this.montant = this.montant + dep;
    }
    public void retrait(double ret){
        if (this.montant >= ret){
            this.montant = this.montant - ret;
        } else {
            System.out.println("Vous n'avez pas assez. Votre montant est de "+this.montant);
        }

    }

}
