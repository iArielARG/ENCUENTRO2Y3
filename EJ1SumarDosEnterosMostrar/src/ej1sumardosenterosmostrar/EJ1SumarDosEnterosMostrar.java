//1. ESCRIBIR UN PROGRAMA QUE PIDA DOS NÚMEROS ENTEROS POR TECLADO Y CALCULE LA
//SUMA DE LOS DOS. EL PROGRAMA DEBERA DESPUÉS MOSTRAR EL RESULTADO DE LA SUMA.
package ej1sumardosenterosmostrar;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ1SumarDosEnterosMostrar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE SUMA DOS NÚMEROS ENTEROS");
        System.out.println("***************************************************");
        System.out.println("Ingrese un número entero y presione ENTER");
        int num1 = leer.nextInt();
        System.out.println("--------------------------------------------");
        System.out.println("Ingrese otro número entero y presione ENTER");
        int num2 = leer.nextInt();
        System.out.println("--------------------------------------------");
        
        int resultadoSuma = num1 + num2;
        
        System.out.println("El resultado de la suma de dos números enteros es: " + resultadoSuma);
        System.out.println("***************************************************");
    }
    
}
