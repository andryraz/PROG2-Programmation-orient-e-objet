import java.util.ArrayList;
import java.util.List;

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    @Override
    public int compterAppartements() {
        int total = 0;
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }

    public boolean contientAppartement(Appartement appartement) {
        for (Immeuble immeuble : immeubles) {
            if (immeuble.contientAppartement(appartement)) {
                return true;
            }
        }
        return false;
    }
}