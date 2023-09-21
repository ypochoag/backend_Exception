/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package ejercicio3_excetion;

import Servicio.DivisionNumero;
import java.util.Scanner;

public class Ejercicio3_Excetion {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("En este programa se le pedira que ingrese dos números");
        System.out.println("Ingrese el primer número correspondiente al dividendo");
        String a = leer.nextLine();
        System.out.println("Ingrese el segundo número correspondiente al divisor");
        String b = leer.nextLine();
        
        DivisionNumero servicioDivision = new DivisionNumero();
        
        try {               
            System.out.println("El resultado de la division es de: "+ servicioDivision.divisionNumero(a,b));            
        }catch(ArithmeticException e){
            System.out.println("Error de sistema");
        } 
    }
    
}
