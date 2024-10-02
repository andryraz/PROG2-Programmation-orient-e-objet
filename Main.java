
public class Main {
    public static void main(String[] args) {
        Quartier quartierIvandry = new Quartier("A1", "Ivandry");
        Immeuble immeubleJade = new Immeuble("B1", "Jade", 5);

        Appartement appartement1 = new Appartement("51", "Bel appartement", "Proche des commodités", 500.0, Appartement.Statut.LIBRE, immeubleJade);
        immeubleJade.ajouterAppartement(appartement1);

        // Question1: Vérifier si l'appartement est dans le quartier
        boolean present = quartierIvandry.contientAppartement(appartement1);
        System.out.println("Appartement présent dans le quartier : " + present);

        //Question2: Compter le nombre d'appartements dans le quartier
        int nombreAppartements = quartierIvandry.compterAppartements();
        System.out.println("Nombre d'appartements dans le quartier : " + nombreAppartements);
    }
}
