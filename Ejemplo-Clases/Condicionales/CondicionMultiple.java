package Condicionales;
public class CondicionMultiple {
    public static void main(String[] args) {
        int numero = 0; // Valor fijo asignado

        // Evaluamos con múltiples condiciones
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        System.out.println("Fin del programa.");
    }
    /**NOTA!!!
     * if (numero > 0) → Se ejecuta si el número es positivo.
     * else if (numero < 0) → Se ejecuta si el número es negativo.
     * else → Se ejecuta si ninguna condición anterior se cumple (cuando el número es 0).
     * Como numero es 0, imprimirá "El número es cero."
     */
}
