/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;
import java.util.Scanner;

/**
 *
 * @author CEN LABO B
 */
public class condicionswitch {
    
    
      public static void main(String[] args) {
          System.out.println("ingresa un simbolo (+)");
          System.out.println("ingresa un simbolo (-)");
          System.out.println("ingresa un simbolo (*)");
          System.out.println("ingresa un simbolo (/)");

          char signo('+');
          Scaner entrada=new Scaner (source: System.in);
          string sim=entrada.nextline();
          int n1=10;
          int n2=10;
          int calculo;

        // Evaluamos la opción con switch
        switch (sim) {
            case ("+"):
            calculo=n1+n2;
                System.out.println("Seleccionaste la opción 1."+calculo);
                break;
            case("-") :
                System.out.println("Seleccionaste la opción 2.");
                break;
            case ("*"):
                System.out.println("Seleccionaste la opción 3.");
                case ("/"):
                System.out.println("Seleccionaste la opción 4.");
                break;
            default :
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }
 
            

}
