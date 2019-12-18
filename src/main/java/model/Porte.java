package model;

import java.util.Objects;

public class Porte {

    private Integer numeroDePorte;

    public Porte(Integer numeroDePorte) {
        this.numeroDePorte = numeroDePorte;
    }

    public Integer getNumeroDePorte() {
        return numeroDePorte;
    }

    public void setNumeroDePorte(Integer numeroDePorte) {
        this.numeroDePorte = numeroDePorte;
    }

    @Override
    public String toString() {
        return "Porte{" +
                "numeroDePorte=" + numeroDePorte +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Porte porte = (Porte) o;
        return Objects.equals(numeroDePorte, porte.numeroDePorte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDePorte);
    }
}
