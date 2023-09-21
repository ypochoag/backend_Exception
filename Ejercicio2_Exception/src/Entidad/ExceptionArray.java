/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Yuri Ochoa
 */
public class ExceptionArray extends Exception {

    /**
     * Creates a new instance of <code>ExceptionArray</code> without detail
     * message.
     */
    public ExceptionArray() {
    }

    /**
     * Constructs an instance of <code>ExceptionArray</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionArray(String msg) {
        super(msg);
    }
}
