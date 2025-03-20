package Condicionales;
public class CondicionSimple {
    public static void main(String[] args) {
        // SOLO IF 
        int numero = 15; // Valor fijo asignado

        // Evaluamos con una condición simple
        if (numero > 10) {
            System.out.println("El número es mayor a 10.");
        }

        System.out.println("Fin del programa.");
    }
    /**Nota!!
     * if (numero > 10) ---> Se ejecuta solo si la condición es verdadera.
     * Como numero(nombre_variable) es 15, el mensaje se imprimirá.
     * Si cambiamos numero a un valor menor o igual a 10, no se imprimirá nada.
     */

}
