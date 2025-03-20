// Definimos una clase llamada TiposDeVariables
public class TiposDeVariables {

    public static void main(String[] args) {
        // TIPOS DE VARIABLES MaS COMUNES EN JAVA

        // 1. Enteros (int) - Almacena números enteros
        int edad = 17; // Declaramos una variable entera llamada edad y le asignamos el valor 17

        // 2. Decimales (double) - Almacena números con decimales
        double altura = 1.75; // Variable de tipo double con el valor 1.75

        // 3. Caracteres (char) - Almacena un solo carácter (se usa comilla simple)
        char inicial = 'A'; // Variable de tipo char con la letra 'A'

        // 4. Cadenas de texto (String) - Almacena texto
        String nombre = "Elias"; // Variable de tipo String con el texto "Elias"

        // 5. Booleanos (boolean) - Almacena valores verdadero o falso
        boolean esMayorDeEdad = false; // Variable booleana con el valor falso

        // MOSTRAMOS LOS VALORES DE LAS VARIABLES
        System.out.println("Nombre: " + nombre);
        System.out.println("Inicial del nombre: " + inicial);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);

        // MODIFICAMOS ALGUNAS VARIABLES
        edad = 18; // Cambiamos el valor de la edad
        esMayorDeEdad = true; // Ahora es mayor de edad

        // Mostramos los valores actualizados
        System.out.println("Después de modificar valores:");
        System.out.println("Nueva edad: " + edad);
        System.out.println("¿Ahora es mayor de edad?: " + esMayorDeEdad);
    }
}