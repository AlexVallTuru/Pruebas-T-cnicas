package src;

import java.util.List;

public class Superheroes {

    String nombre;
    String nombreReal;
    String afilacion;
    List<String> poderes;
  
    public Superheroes(String nombre, String nombreReal, String afilacion, List<String> poderes) {
        this.nombre = nombre;
        this.nombreReal = nombreReal;
        this.afilacion = afilacion;
        this.poderes = poderes;
    }
    
    public Superheroes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getAfilacion() {
        return afilacion;
    }

    public void setAfilacion(String afilacion) {
        this.afilacion = afilacion;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }


    
    @Override
    public String toString() {
        return "superheroes [nombre=" + nombre + ", nombreReal=" + nombreReal + ", afilacion=" + afilacion
                + ", poderes=" + poderes + "]";
    }
    
    
    
}
