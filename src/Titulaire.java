import java.time.LocalDate;

public class Titulaire {
    String nom;
    String prenom;
    String Adresse;
    int ID;
    LocalDate dateNess;
    public void move(String newAdresse){
        this.Adresse = newAdresse;
    }
    public void birthday(){
        System.out.println("Happy Birthday"+this.nom+"  "+this.prenom+" !");
    }

}
