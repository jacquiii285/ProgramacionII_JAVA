Import java.util.Scanner;
public class ParseoDatos {
    public static void main(String[] args) {
        // Parseo con variable inicializada
        // En Java, los datos ingresados por el usuario o extraídos de un archivo suelen estar en formato String
        // Para poder realizar operaciones matemáticas, es necesario convertirlos a tipos numéricos
        
        String numeroTexto = "777"; // Se declara una variable String que contiene un número en formato texto
        int numeroEntero = Integer.parseInt(numeroTexto); // Convierte el String a un número entero con Integer.parseInt()
        double numeroDecimal = Double.parseDouble("123.45"); // Convierte el String a un número decimal con Double.parseDouble()
        
        // Imprime los valores parseados en la consola
        System.out.println("Número entero parseado: " + numeroEntero); // Se muestra el número convertido a entero
        System.out.println("Número decimal parseado: " + numeroDecimal); // Se muestra el número convertido a decimal
        
        // Parseo con Scanner
        // La clase Scanner permite leer datos ingresados por el usuario desde el teclado
        Scanner scanner = new Scanner(System.in); // Se crea un objeto Scanner para capturar la entrada del usuario
        
        // Método optimizado para capturar y convertir datos
        System.out.print("Ingrese un número entero: ");
        int numeroIngresado = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Ingrese un número decimal: ");
        double decimalIngresado = Double.parseDouble(scanner.nextLine());
        
        // Imprime los valores ingresados por el usuario después de la conversión
        System.out.println("Número entero ingresado: " + numeroIngresado);
        System.out.println("Número decimal ingresado: " + decimalIngresado);
        
        // Importante: si el usuario ingresa un valor no válido (como letras en lugar de números), el programa lanzará una excepción
        
    }
}
