package Modelo;

import java.util.Scanner;

class DoublyLinkedApp {

    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- Menú -----");
            System.out.println("1. Insertar lista");
            System.out.println("    1. Cabeza");
            System.out.println("    2. Final");
            System.out.println("    3. Antes de un valor");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese un valor a insertar: ");
                    int valor = scanner.nextInt();
                    System.out.print("Selecciona una subopción para insertar: ");
                    int subopcion = scanner.nextInt();
                    switch (subopcion) {
                        case 1 -> {
                            System.out.println("Insertando en la cabeza de la lista...");
                            theList.insertFirst(valor);
                        }
                        case 2 -> {
                            System.out.println("Insertando al final de la lista...");
                            theList.insertLast(valor);
                        }
                        case 3 -> {
                            System.out.println("Insertando despues de un valor en la lista...");
                            System.out.println("Ingrese el valor de referencia");
                            int key = scanner.nextInt();
                            theList.insertAfter(key, valor);
                        }
                        default -> {
                            System.out.println("Subopción inválida.");
                        }
                    }
                }

                case 2 -> {
                    System.out.println("Mostrando la lista...");
                    theList.displayForward();
                    theList.invertir();
                    theList.displayForward();
                    theList.invertir();
                }

                case 3 -> {
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                }

                default ->
                    System.out.println("Opción inválida.");
            }

            System.out.println();
        }
    }
}
