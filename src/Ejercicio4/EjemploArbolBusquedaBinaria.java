package Ejercicio4;

public class EjemploArbolBusquedaBinaria {


        public static void main(String[] args) {

            ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

            arbol.insertar(50);
            arbol.insertar(30);
            arbol.insertar(70);
            arbol.insertar(20);
            arbol.insertar(40);
            arbol.insertar(60);
            arbol.insertar(80);

            System.out.println("--- Recorrido InOrden ---");
            arbol.mostrar(); // O arbol.inOrden();

            System.out.println("\n--- Recorrido PreOrden ---");
            arbol.preOrden();

            System.out.println("\n--- Recorrido PostOrden ---");
            arbol.postOrden();

            System.out.println("\n--- Prueba de Búsqueda ---");
            System.out.println("¿Está el 40?: " + arbol.buscar(40));
            System.out.println("¿Está el 90?: " + arbol.buscar(90));
            System.out.println("¿Está el 50?: " + arbol.buscar(50));

        }
    }

