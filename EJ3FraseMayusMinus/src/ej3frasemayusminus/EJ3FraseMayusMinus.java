//ESCRIBIR UN PROGRAMA QUE PIDA UNA FRASE Y LA MUESTRE TODA EN MAYÚSCULAS Y
//DESPUÉS TODA EN MINÚSCULAS.
package ej3frasemayusminus;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ3FraseMayusMinus {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE TRANSFORMA UNA FRASE EN MAYÚSCULAS Y MINÚSCULAS");
        System.out.println("**************************************************************************");
        System.out.println("POR FAVOR ESCRIBA UNA FRASE Y LUEGO PRESIONE ENTER");
        String frase = leer.nextLine();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("ASÍ SE VE LA FRASE UNA VEZ TRANSFORMADA A MAYÚSCULAS");
        String mayusculas = frase.toUpperCase();
        System.out.println(mayusculas);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("ASÍ SE VE LA FRASE UNA VEZ TRANSFORMADA A MINÚSCULAS");
        String minusculas = frase.toLowerCase();
        System.out.println(minusculas);
        System.out.println("**************************************************************************");
        System.out.println("FIN DEL PROGRAMA");
    }   
}
