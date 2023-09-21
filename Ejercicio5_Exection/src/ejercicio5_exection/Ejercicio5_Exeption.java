/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package ejercicio5_exection;

import Entidad.ExceptionAdivinarNumero;
import Servicio.ServicioAdividnarNumero;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio5_Exeption {

    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        ServicioAdividnarNumero adivinaNumeroS = new ServicioAdividnarNumero();
        System.out.println("Bienvenido al juego Adivina el número");
        adivinaNumeroS.generarNumero();
        boolean bandera = false;
        int cont = 0;
        while(bandera==false){
            try {
                System.out.println("");
                System.out.println("Ingrese un número del 1 al 500:");
                bandera = adivinaNumeroS.comparaNumero(leer.nextInt()); 
                leer.nextLine();
                cont++;
                System.out.println("Lleva " + cont + " intentos");

            }catch(InputMismatchException e){
                System.out.println("Error: No has ingresado el tipo de dato correspondiente");
                cont++;
                System.out.println("Lleva " + cont + " intentos");
                leer.nextLine();
            }catch(ExceptionAdivinarNumero e){
                System.out.println(e.getMessage());
                cont++;
                System.out.println("Lleva " + cont + " intentos");
                leer.nextLine();
            }
        }
    }    
}


