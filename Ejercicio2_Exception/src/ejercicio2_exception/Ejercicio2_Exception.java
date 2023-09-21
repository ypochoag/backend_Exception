/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package ejercicio2_exception;

import Entidad.DatoArray;
import Servicio.ServicioDato;


public class Ejercicio2_Exception {


    public static void main(String[] args) {
        
        ServicioDato sd = new ServicioDato();   
        DatoArray dato = sd.crearData();
        sd.ingresoDatos(dato);
        
//        dato.ingresarElemento(6, 5);
//        dato.ingresarElemento(3, 11);
    }
    
}
