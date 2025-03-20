package Condicionales;
public class CondicionDoble {
    // IF "COMPUESTO" (DOS OPCIONES) 
    // IF-ELSE
    public static void main(String[] args) {
        
        int numero = -5; // Valor fijo asignado

        // Evaluamos con if y else
        if (numero >= 0) {
            System.out.println("El número es positivo o cero.");
        } else {
            System.out.println("El número es negativo.");
        }

        System.out.println("Fin del programa.");
    }
    /**Nota!!
     * if (numero >= 0) → Se ejecuta si la condición es verdadera.
     * else → Se ejecuta si la condición es falsa.
     * Como numero es -5, el programa imprimirá "El número es negativo."
     */
}
