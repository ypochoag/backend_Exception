
package Servicio;

import Entidad.DatosExcepciones;
import Entidad.ExceptionVariados;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ServicioDatos {
    DatosExcepciones numeros = new DatosExcepciones();
    Scanner leer = new Scanner(System.in);
    public void ingresoDatos() throws InputMismatchException{
            System.out.println("Ingrese el número dividendo");  
            numeros.setNumero1(leer.nextLine());
            System.out.println("Ingrese el número divisor");
            numeros.setNumero2(leer.nextLine());
    }
    
    public double dividirNumeros() throws NumberFormatException, ArithmeticException {
            int num1 = Integer.parseInt(numeros.getNumero1());
            System.out.println("num1 es " + num1);
            int num2 = Integer.parseInt(numeros.getNumero2());
            System.out.println("num2 es " + num2);
            System.out.println("El resultado de la division es");
            double resultado = num1/num2;
            return resultado;
    }
}
