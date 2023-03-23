//ESCRIBIR UN PROGRAMA QUE LEA UN NÚMERO ENTERO POR TECLADO Y MUESTRE POR
//PANTALLA EL DOBLE, EL TRIPLE Y LA RAÍZ CUADRADA DE ESE NÚMERO.
package ej5enterodobletripleraiz;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ5EnteroDobleTripleRaiz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE MUESTRA EL DOBLE, EL TRIPLE Y LA RAÍZ CUADRADA DE UN NÚMERO");
        System.out.println("**************************************************************************************");
        System.out.println("INGRESE UN NÚMERO ENTERO Y PRESIONE ENTER");
        int entero = leer.nextInt();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("El doble del número ingresado es: " + entero * 2);
        System.out.println("El triple del número ingresado es: " + entero * 3);
        System.out.println("La raíz cuadrada del número ingresado es: " + (int)Math.sqrt(entero));
        System.out.println("**************************************************************************************");
    }
    
}
