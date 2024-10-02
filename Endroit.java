public abstract class Endroit {
    private String  id;
    private String nom;

    public Endroit(String  id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String  getId() { return id; }
    public String getNom() { return nom; }

    // Méthode pour compter les appartements
    public abstract int compterAppartements();
}
