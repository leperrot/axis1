/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author leperrot
 */
public class CheckFaultBean {
    
    private String message;

    public CheckFaultBean(String message) {
        this.message = message;
    }
    
    public CheckFaultBean() {}

    public String getMessage() {
        return message;
    }
}
