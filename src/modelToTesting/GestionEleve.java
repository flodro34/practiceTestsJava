package modelToTesting;

import java.util.ArrayList;
import java.util.List;

public class GestionEleve {

    private List<Eleve> eleves;

    public GestionEleve() {
        eleves = new ArrayList<Eleve>();
    }

    public void ajouterEleve(Eleve eleve) {
        eleves.add(eleve);
    }

    public void supprimerEleve(Eleve eleve) {
        eleves.remove(eleve);
    }

    public double calculerMoyenne() {
        if(eleves.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for(Eleve eleve : eleves) {
            total +=eleve.getMoyenne();
        }
        return total / eleves.size();
    }
}
