package Ejercicio2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Crear la LinkedList de canciones
        LinkedList<Cancion> playlist = new LinkedList<>();


        // 1. Añadir al FINAL:
        //    - Bohemian Rhapsody
        //    - Imagine
        playlist.addLast(new Cancion("Bohemian Rhapsody", "Queen", 354));
        playlist.addLast(new Cancion("Imagine", "John Lennon", 183));


        // 2. Añadir Hotel California al PRINCIPIO

        playlist.addFirst(new Cancion("Hotel California", "Eagles", 390));


        // 3. Añadir Wonderwall al FINAL

        playlist.addLast(new Cancion("Wonderwall", "Oasis", 258));


        // 4. Mostrar la primera canción

        System.out.println("Primera canción: " + playlist.getFirst());


        // 5. Mostrar la última canción

        System.out.println("Última canción: " + playlist.getLast());


        // 6. Pedir al usuario un título y buscarlo
        //    dentro de la playlist.

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIntroduce el título que quieres buscar: ");
        String tituloBuscado = teclado.nextLine();

        Cancion encontrada = null;

        for (Cancion cancion : playlist) {

            if (cancion.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                encontrada = cancion;
                break;
            }
        }

        if (encontrada != null) {
            System.out.println("Canción encontrada:");
            System.out.println(encontrada);
        } else {
            System.out.println("La canción no está en la playlist.");
        }




        // 7. Eliminar la primera canción

        playlist.removeFirst();

        // 8. Eliminar la última canción

        playlist.removeLast();

        // Mostrar la playlist final

        System.out.println("\n=== PLAYLIST FINAL ===");

        // COMPLETAR
        for (Cancion cancion : playlist) {
            System.out.println(cancion);
        }

        teclado.close();
    }
}