/*
 * Ejercicio2.java
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

    static Scanner scanner = new Scanner(System.in);
    static List<String> alumnos = new ArrayList<>();

    public static void main(String[] args) {
        String menu = """
                        1. Añadir un alumno.
                        2. Mostrar todos los alumnos.
                        3. Buscar un alumno por su nombre.
                        4. Eliminar un alumno por su nombre.
                        5. Mostrar cuántos alumnos hay registrados.
                        6. Salir
                    """;

        int seleccion = -1;

        do {
            System.out.printf("%nSelecciona una de las opciones del menu.%n%s", menu);
            seleccion = scanner.nextInt();
            scanner.nextLine(); // Limpia el salto de línea pendiente

            switch (seleccion) {
                case 1 -> anadirAlumno();
                case 2 -> mostrarAlumnos();
                case 3 -> buscarAlumno();
                case 4 -> eliminarAlumno();
                case 5 -> {
                    System.out.println("Usted ha elegido la opción 5, se enseñarán todos los alumnos registrados");
                    System.out.printf("Nº de alumnos: %d%n%n", alumnos.size());
                }
                case 6 -> System.out.println("Ha decidido salir");
                default -> System.out.println("Usted ha elegido una opción inválida");
            }
        } while (seleccion != 6);
    }

    // Método para la opción 1: Añadir alumno
    public static void anadirAlumno() {
        System.out.println("Usted ha elegido la opción 1, añadir alumno.");
        System.out.print("Introduce el nombre: ");
        String alumno = scanner.nextLine();

        String menuInterno = """
                1. Si
                2. No
            """;
        System.out.printf("¿Añadir a %s definitivamente o no?%n%s", alumno, menuInterno);
        int confirmar = scanner.nextInt();
        scanner.nextLine(); // Limpia el salto de línea pendiente

        switch (confirmar) {
            case 1 -> {
				if (!alumnos.contains(alumno))
                alumnos.add(alumno);
                System.out.printf("Se ha agregado a %s a la lista de alumnos.%n", alumno);
            }
            case 2 -> System.out.println("Volviendo al menú...");
            default -> System.out.println("Opción no válida.");
        }
    }

    // Método para la opción 2: Mostrar todos los alumnos
    public static void mostrarAlumnos() {
        System.out.println("Usted ha elegido la opción 2, se enseñarán todos los alumnos... ");
        System.out.print(alumnos + "\n");
    }

    // Método para la opción 3: Buscar un alumno por su nombre
    public static void buscarAlumno() {
        System.out.println("Usted ha elegido la opción 3, se buscará el alumno.");
        System.out.print("Introduce el nombre del alumno a buscar: ");
        String alumno = scanner.nextLine();

        String mensaje = alumnos.contains(alumno) ? "Sí está este alumno" : "No está este alumno";
        System.out.println(mensaje);
    }

    // Método para la opción 4: Eliminar un alumno por su nombre
    public static void eliminarAlumno() {
        System.out.println("Usted ha elegido la opción 4, se eliminará el alumno");
        System.out.print("Introduce el nombre: ");
        String alumno = scanner.nextLine();

        String menuInterno = """
                1. Si
                2. No
            """;
        System.out.printf("¿Eliminar a %s definitivamente o no?%n%s", alumno, menuInterno);
        int confirmar = scanner.nextInt();
        scanner.nextLine(); // Limpia el salto de línea pendiente

        switch (confirmar) {
            case 1 -> {
                alumnos.remove(alumno);
                System.out.printf("Se ha eliminado a %s de la lista de alumnos.%n", alumno);
            }
            case 2 -> System.out.println("Volviendo al menú...");
            default -> System.out.println("Opción no válida.");
        }
    }
}
