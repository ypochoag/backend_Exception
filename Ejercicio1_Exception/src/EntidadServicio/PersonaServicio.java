package EntidadServicio;

import Entidad.Exception_Persona;
import Entidad.Persona;
import java.util.Scanner;


public class PersonaServicio {
      
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        Persona p1 = new Persona();  
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese su sexo H hombre, M mujer, O otro");
        p1.setSexo(leer.nextLine().toLowerCase());
        
        while(p1.getSexo()=="H" || p1.getSexo()=="M" || p1.getSexo()=="O"){
        System.out.println("Por favor ingrese su sexo H hombre, M mujer, O otro");
        p1.setSexo(leer.nextLine().toLowerCase());
        } 
        
        System.out.println("Ingrese su peso en kilogramos");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura en metros");
        p1.setAltura(leer.nextDouble());
        return p1;     
    }
    
    public int calcularIMC(Persona p1){
        Double imc = p1.getPeso()/Math.pow(p1.getAltura(),2);
        
        if (imc < 20){
            System.out.println("Esta por debajo de su peso ideal");
            System.out.println("-1");
            return -1;
        }else if(imc>=20 && imc<=25 ){
            System.out.println("Esta en su peso ideal");
            System.out.println("0");
            return 0;
        }else{
            System.out.println("Tiene sobre peso");
            System.out.println("1");
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona p1)throws Exception_Persona{
        boolean bandera = false;
        try{        
            if(p1.getEdad() >= 18){
            System.out.println("Es mayor de edad");
            bandera = true;
            }
            if(p1.getEdad() <= 18 && p1.getEdad() > 0 ){
            System.out.println("Es menor de edad");
            bandera = false;
            }
            if(p1.getEdad() <= 0){
                throw new Exception_Persona("Debe indicar la edad de la persona, no puede ser menor a cero");
            }             
        }catch(Exception_Persona e){
            throw e;
        }catch(Exception e){            
            e.printStackTrace();
            throw new Exception_Persona("Error de sistema");
        } 
        return bandera;
    }
    
    
    
    
}