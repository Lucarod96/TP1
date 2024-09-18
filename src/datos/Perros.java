package datos;

import java.util.Comparator;
import java.util.Objects;

public class Perros {
    
    String raza;

    public Perros() {
    }

    public Perros(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.raza);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perros other = (Perros) obj;
        return Objects.equals(this.raza, other.raza);
    }
    
    public static Comparator<Perros> compararRaza = new Comparator<Perros>() {
        @Override
        public int compare(Perros p1, Perros p2) { 
            return p2.getRaza().compareTo(p1.getRaza());
        }
    };       
}
