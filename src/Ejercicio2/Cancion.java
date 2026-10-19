package Ejercicio2;

public class Cancion {

    // ATRIBUTOS
    private String titulo;
    private String artista;
    private int duracion;


    // CONSTRUCTOR
    public Cancion(String titulo, String artista, int duracion) {

        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;

    }


    // GETTERS

    public String getTitulo() {
        return this.titulo;
    }

    public String getArtista() {
        return this.artista;
    }

    public int getDuracion() {
        return this.duracion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Artista: " + artista + " | Duración: " + duracion + "s";
    }
}