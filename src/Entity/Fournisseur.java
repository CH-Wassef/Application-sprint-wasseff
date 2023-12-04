package Entity;

public class Fournisseur {
    int id;
    String nom;
    String prenom;
    String email;
    String adresse;

    public Fournisseur(){}

    public Fournisseur(int id,String nom,String prenom,String email,String adresse){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.adresse=adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
