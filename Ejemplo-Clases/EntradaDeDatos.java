// Importamos la librería Scanner para poder recibir datos del usuario
import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine(); // Captura una línea de texto

        // Pedimos al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Captura un número entero

        // Pedimos al usuario que ingrese su altura
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble(); // Captura un número decimal

        // Mostramos los datos ingresados
        System.out.println("\nDatos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");

    }
}
