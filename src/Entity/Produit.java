package Entity;

public class Produit {
    int id;
    String nom;
    String libelle;
    double prix;
    int matricule;
    public Produit(int id,String nom,String libelle,int matricule){
        this.id=id;
        this.nom=nom;
        this.libelle=libelle;
        this.prix=prix;
        this.matricule=matricule;}

    public Produit(int id,String nom,String libelle,double prix,int matricule){
        this.id=id;
        this.nom=nom;
        this.libelle=libelle;
        this.prix=prix;
        this.matricule=matricule;
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

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", libelle='" + libelle + '\'' +
                ", prix=" + prix +
                ", matricule=" + matricule +
                '}';
    }
}
