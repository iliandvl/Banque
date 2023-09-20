import java.util.HashMap;

public class Banque {
    String nom;
    String Pays;
    HashMap<String, Compte> comptes = new HashMap<>();
    public void addCompte(Compte c){
        comptes.put(c.numCompte, c);
    }
    public void reremoveCompte(String numCompte){
        comptes.remove(numCompte);
    }

}
