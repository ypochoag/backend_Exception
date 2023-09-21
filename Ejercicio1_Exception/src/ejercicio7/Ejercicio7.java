/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package ejercicio7;

import Entidad.Exception_Persona;
import Entidad.Persona;
import EntidadServicio.PersonaServicio;

public class Ejercicio7 {


    public static void main(String[] args) throws Exception_Persona {
        PersonaServicio ps2 = new PersonaServicio(); 
        try{
            Persona persona1 = new Persona("Paola", 23, "M", 56.7, 1.60);
            Persona persona2 = new Persona("Paola", 0, "M", 56.7, 1.60);
         
            ps2.esMayorDeEdad(persona2);    
         }catch(Exception_Persona e){
            System.out.println(e.getMessage());
        }catch(Exception e){            
            throw new Exception_Persona(e.getMessage());
        }  

         
        
        
//        int[] peso = new int[4];
//        boolean[] edad = new boolean[4];       
//        for (int i = 0; i < 4; i++) {
//            PersonaServicio ps = new PersonaServicio();
//            Persona p1 = ps.crearPersona();
//            peso[i] = ps.calcularIMC(p1);
//            edad[i] = ps.esMayorDeEdad(p1);
//            System.out.println(" ");
//        }
//        
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Peso" + peso[i]);
//        }
//        
//        
//        double contDp = 0;
//        int contIp = 0;
//        int contSp = 0;
//        for (int i = 0; i < 4; i++) {
//            switch (peso[i]) {
//                case -1:
//                    contDp= contDp +1 ;
//                    break;
//                case 0:
//                    contIp=contIp +1;
//                    break;
//                default:
//                    contSp++;
//                    break;
//            }
//        }
//        double porcentaje1 = ((contDp/4)*100);
//        double porcentaje2 =((contIp/4)*100);
//        double porcentaje3 = ((contSp/4)*100);
//        System.out.println("El " + porcentaje1 + "% estan por debajo del peso");
//        System.out.println("El " + porcentaje2 + "% estan en el peso Ideal" );
//        System.out.println("El " + porcentaje3 + "% estan con sobrepeso" );
//    
//        int contMayorEdad = 0;
//        int contMenorEdad = 0;
//        for (int i = 0; i < 4; i++) {
//           if (edad[i] == true ) {
//               contMayorEdad++;
//           }else{
//               contMenorEdad++; 
//           }
// 
//        }
//        System.out.println("El " + ((contMayorEdad/4)*100)+ "% son mayores de edad" );
//        System.out.println("El " + ((contMenorEdad/4)*100)+ "% son menores de edad" );       
    }
    
    
}
