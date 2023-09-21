
package Servicio;

import Entidad.ExceptionDivision;
import static java.lang.Integer.parseInt;


public class DivisionNumero {
    public double divisionNumero(String a, String b) throws ArithmeticException {
        int x = parseInt(a);
        int y = parseInt(b);
        double division = x/y;
        return division;     
    }
}
