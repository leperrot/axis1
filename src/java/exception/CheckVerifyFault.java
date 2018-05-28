/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import javax.xml.ws.WebFault;

/**
 *
 * @author leperrot
 */
@WebFault(name = "CheckVerifyFault")
public class CheckVerifyFault extends Exception{
    
    private CheckFaultBean faultInfo;

    public CheckVerifyFault(CheckFaultBean faultInfo, String message) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public CheckVerifyFault(CheckFaultBean faultInfo, String message, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public CheckFaultBean getFaultInfo() {
        return faultInfo;
    }
}
