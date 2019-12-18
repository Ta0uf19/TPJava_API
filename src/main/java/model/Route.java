package model;

import java.util.ArrayList;
import java.util.List;

public class Route {

    // liste non triée sans com
    public List<Porte> portes;

    public Route() {
        this.portes = new ArrayList<Porte>();
    }

    public void addPorte(Porte porte) {
        portes.add(porte);
    }

    @Override
    public String toString() {
        return "Route{" +
                "portes=" + portes +
                '}';
    }
}
