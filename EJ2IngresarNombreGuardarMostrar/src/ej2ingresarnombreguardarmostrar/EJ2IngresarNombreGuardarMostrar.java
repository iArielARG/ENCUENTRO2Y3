//ESCRIBIR UN PROGRAMA QUE PIDA TU NOMBRE, LO GUARDE EN UNA VARIABLE Y
//LO MUESTRE POR PANTALLA.
package ej2ingresarnombreguardarmostrar;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ2IngresarNombreGuardarMostrar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA QUE INGRESAS Y MUESTRA TU NOMBRE");
        System.out.println("*******************************************************");
        System.out.println("INGRESE SU NOMBRE Y PRESIONE ENTER");
        String nombre = leer.nextLine();
        System.out.println("*******************************************************");
        System.out.println("Usted ha ingresado que su nomre es " + nombre);
    }
}