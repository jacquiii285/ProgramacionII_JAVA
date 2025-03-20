package Condicionales;
public class ConcatenacionTexto {
    public static void main(String[] args) {
        // CONCATENACIÓN EN JAVA
        // La concatenación es el proceso de UNIR cadenas de texto con el operador +

        // Definimos algunas variables de tipo String
        String nombre = "Tiago";
        String apellido = "Torres";
        
        // Concatenamos nombre y apellido en una nueva variable
        String nombreCompleto = nombre + " " + apellido;

        // Mostramos el resultado
        System.out.println("Nombre completo: " + nombreCompleto);

        // También podemos concatenar texto con otros tipos de datos
        int edad = 17;
        System.out.println("Su nombre es " + nombre + " y tiene " + edad + " años.");

        // Concatenación usando += 
        String mensaje = "Hola, ";
        mensaje += nombre; // Equivalente a mensaje = mensaje + nombre;
        System.out.println(mensaje);

        // Concatenación con salto de línea (\n) y tabulación (\t)
        System.out.println("Datos del usuario:\n\tNombre: " + nombre + "\n\tApellido: " + apellido + "\n\tEdad: " + edad);
    }
}
