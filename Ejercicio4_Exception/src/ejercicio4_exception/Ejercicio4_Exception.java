/*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones.
 */
package ejercicio4_exception;

import Entidad.ExceptionVariados;
import Servicio.ServicioDatos;
import java.util.InputMismatchException;

public class Ejercicio4_Exception {

    public static void main(String[] args) throws ExceptionVariados {
        ServicioDatos datos = new ServicioDatos();
        
        try {
            datos.ingresoDatos();     
        } catch (InputMismatchException e){
            System.out.println("Error: No has ingresado el tipo de dato correspondiente");
        } catch (Exception e) { 
            throw new ExceptionVariados("Error de sistema");
        }finally{
            System.out.println("Gracias por ingresar los datos al programa");
        }
        
        try {
            System.out.println(datos.dividirNumeros());     
        }catch (NumberFormatException e){
            System.out.println("Error: no se pudo convertir el string a un número entero");
        }catch (ArithmeticException e){
            System.out.println("Error: no se puede dividir por cero");
        }finally{
            System.out.println("Saliendo del programa");
        }    
    }   
}
