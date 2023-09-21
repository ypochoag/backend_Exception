
package Entidad;

import java.util.Arrays;


public class DatoArray {
    private int[] dato; 

    public DatoArray() {
    }

    public DatoArray(int tamano) {
        this.dato = new int[tamano];
    }

    public int[] getDato() {
        return dato;
    }

    public void setDato(int[] dato) {
        this.dato = dato;
    }

    public void ingresarElemento(int indice, int valor){
         try{  
            dato[indice] = valor;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: el indice esta fuera del rango");      
        }
    }
    
    @Override
    public String toString() {
        return "El dato es " + Arrays.toString(dato);
    }
    
    
}
