package model;

import java.math.BigDecimal;

public class Voyage {
    private Porte entree;
    private Porte sortie;
    private CompagnieAutoroute autoroute;
    private BigDecimal tarif;

    public Voyage(Porte entree, Porte sortie, CompagnieAutoroute autoroute) {
        this.entree = entree;
        this.sortie = sortie;
        this.autoroute = autoroute;
    }

    public Porte getEntree() {
        return entree;
    }

    public void setEntree(Porte entree) {
        this.entree = entree;
    }

    public Porte getSortie() {
        return sortie;
    }

    public void setSortie(Porte sortie) {
        this.sortie = sortie;
    }

    public CompagnieAutoroute getAutoroute() {
        return autoroute;
    }

    public void setAutoroute(CompagnieAutoroute autoroute) {
        this.autoroute = autoroute;
    }

    public BigDecimal getTarif() {
        return tarif;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }
}
