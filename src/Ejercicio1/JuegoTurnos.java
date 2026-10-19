package Ejercicio1;

public class JuegoTurnos {

    private CListaCircularSE jugadores;
    private NodoJugador jugadorActual;

    public JuegoTurnos() {
        jugadores = new CListaCircularSE();
        jugadorActual = null;
    }

    public void agregarJugador(String nombre, int puntuacionInicial) {
        jugadores.agregar(nombre, puntuacionInicial);

        if (jugadorActual == null) {
            jugadorActual = jugadores.getPrimero();
        }
        System.out.println("Jugador '" + nombre + "' agregado.");
    }

    public void eliminarJugador(String nombre) {
        NodoJugador aEliminar = jugadores.buscar(nombre);

        if (aEliminar != null) {
            if (aEliminar == jugadorActual) {
                if (jugadorActual.siguiente == jugadorActual) {
                    jugadorActual = null;
                } else {
                    jugadorActual = jugadorActual.siguiente;
                }
            }

            jugadores.eliminar(nombre);
            System.out.println("Jugador '" + nombre + "' eliminado.");
        } else {
            System.out.println("El jugador '" + nombre + "' no existe.");
        }
    }

    public void siguienteTurno() {
        if (jugadorActual != null) {
            jugadorActual = jugadorActual.siguiente;
            System.out.println("Turno avanzado. Es el turno de: " + jugadorActual.getNombre());
        } else {
            System.out.println("No hay jugadores para avanzar el turno.");
        }
    }

    public void mostrarJugadores() {
        jugadores.mostrar();
    }

    public NodoJugador getJugadorActual() {
        return jugadorActual;
    }
}
