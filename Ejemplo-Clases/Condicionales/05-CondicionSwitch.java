package Condicionales;
public class CondicionSwitch {
    public static void main(String[] args) {
        int opcion = 2; // Valor fijo asignado

        // Evaluamos la opción con switch
        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la opción 1.");
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2.");
                break;
            case 3:
                System.out.println("Seleccionaste la opción 3.");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }
    /**NOTA!
     * switch (opcion) → Evalúa el valor de la variable opcion.
     *  - case 1: → Si opcion es 1, imprime "Seleccionaste la opción 1." y usa break para salir.
     *  -case 2: → Si opcion es 2, imprime "Seleccionaste la opción 2." y usa break.
     *  -case 3: → Si opcion es 3, imprime "Seleccionaste la opción 3." y usa break.
     *  -default: → Se ejecuta si opcion no es 1, 2 o 3, mostrando "Opción no válida.".
     */
}
