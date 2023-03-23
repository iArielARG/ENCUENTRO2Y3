//DADA UNA CANTIDAD DE GRADOS CENTRÍGRADOS SE DEBE MOSTRAR SU EQUIVALENTE EN
//GRADOS FAHRENHEIT. LA FÓRMULA CORRESPONDIENTE ES: F = 32 + (9 * C / 5)
package ej4centrigradosfahrenheit;

import java.util.Scanner;

/**
 * @author iArielARG
 */
public class EJ4CentrigradosFahrenheit {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL PROGRAMA QUE CONVIERTE GRADOS CENTÍGRADOS A FAHRENHEIT");
        System.out.println("********************************************************************");
        System.out.println("INGRESE LOS GRADOS CENTÍGRADOS QUE DESEA CONVERTIR Y PRESIONE ENTER");
        double gradosCentigrados = leer.nextDouble();
        
        double fahrenheit = 32 + (9 * gradosCentigrados / 5);
        
        System.out.println("Los grados centígrados ingresados equivalen a " + fahrenheit + " grados Fahrenheit");
        System.out.println("********************************************************************");
    }
    
}
