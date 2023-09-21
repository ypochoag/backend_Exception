
package Servicio;

import Entidad.AdivinarNumero;
import Entidad.ExceptionAdivinarNumero;


public class ServicioAdividnarNumero {
    AdivinarNumero numero = new AdivinarNumero();
    
    public int generarNumero(){
        numero.setNumerosecreto((int) (1 + ( Math.random() * (500 - 1 + 1))));
        return numero.getNumerosecreto();
    } 
    
    public boolean comparaNumero(int num) throws ExceptionAdivinarNumero {
        boolean bandera = false;
        if (num < numero.getNumerosecreto()){
            System.out.println("El numero ingresado es menor que el número secreto");
        }else if(num > numero.getNumerosecreto() && num <= 500 ){
            System.out.println("El número ingresado es mayor que el número secreto");
        }else if(num == numero.getNumerosecreto()){
            System.out.println("Descubrio el numero secreto " + num);
            bandera = true;
        }else if(num > 500){
            throw new ExceptionAdivinarNumero("El número no puede ser mayor a 500");
        }
        return bandera;
    } 
}
