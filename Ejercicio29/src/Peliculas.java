package src;

public class Peliculas {
    
    String titulo;
    String genero;
    int anio;
    
    public Peliculas(String titulo, String genero, int anio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
    }

    public Peliculas(){
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "peliculas {titulo=" + titulo + ", genero=" + genero + ", anio=" + anio + "}";
    }


}
