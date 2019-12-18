package model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {

    private List<Route> routes; // liste porte non triée
    private List<Tarif> tarifs;

    public CompagnieAutoroute() {
        this.routes = new ArrayList<Route>();
        this.tarifs = new ArrayList<Tarif>();
    }

    private Tarif getTarifCalcule(Porte entree, Porte sortie) {
        // big decimal add error using integer
        Integer prixTotal = 0;
        for(Route r : routes) {
            Porte init = entree;
            for(int i = 0; i < r.portes.size() - 1; i++) {
                if(init.equals(r.portes.get(i))) {
                    Porte e = r.portes.get(i);
                    Porte s = r.portes.get(i+1);
                    init = s;
                    BigDecimal prix = getTarifExacte(e,s).getPrix();
                    prixTotal += prix.intValueExact();
                }

            }
        }
        Tarif newTarif = new Tarif(entree, sortie, new BigDecimal(prixTotal));
        tarifs.add(newTarif);
        return newTarif;
    }

    private Tarif getTarifExacte(Porte entree, Porte sortie) {
        Tarif tarif = null;
        for(Tarif t : tarifs) {
            if(t.getEntree().equals(entree) &&
                    t.getSortie().equals(sortie))  {
                tarif = t;
                break;
            }
        }
        return tarif;
    }

    public BigDecimal obtenirTarif(Porte entree, Porte sortie) {
        if(getTarifExacte(entree,sortie) != null) {
            return getTarifExacte(entree,sortie).getPrix();
        }
        else {
            return getTarifCalcule(entree,sortie).getPrix();
        }
    }

    public void ajouterTarif(Tarif tarif) {
        tarifs.add(tarif);
    }
    public void ajouterRoute(Route route) {
        routes.add(route);
    }
}
