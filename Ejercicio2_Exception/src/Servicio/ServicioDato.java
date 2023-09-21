
package Servicio;

import Entidad.DatoArray;
import java.util.Scanner;

public class ServicioDato{
    Scanner leer = new Scanner(System.in);
   
    public DatoArray crearData(){
        System.out.println("Ingrese el tamaño del array");
        DatoArray dato = new DatoArray(leer.nextInt());
        leer.nextLine();
        return dato;
    }
    
    public void ingresoDatos(DatoArray dato){
        System.out.println("Ingrese el indice donde desea ingresar el dato");
        int indice =  leer.nextInt(); 
        leer.nextLine();
        System.out.println("Ingrese el valor a ingresar");
        int valor =  leer.nextInt();
        leer.nextLine();
        dato.ingresarElemento(indice, valor);
    }               
}
