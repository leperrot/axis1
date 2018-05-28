/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import exception.CheckFaultBean;
import exception.CheckVerifyFault;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author leperrot
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "convertInt")
    public String convertInt(@WebParam(name = "entier") int entier) throws CheckVerifyFault{
        String str;
        try{
            str = ""+entier+"";
        }catch(Exception e){
            throw new CheckVerifyFault(new CheckFaultBean("Exception"), "Fault Detected", e);
        }
        return str;
    }
    
    @WebMethod(operationName = "divide")
    public double divide(@WebParam(name = "entier1") double entier1, @WebParam(name = "entier2") double entier2) throws CheckVerifyFault{
        try{
            if(entier2 == 0)
                throw new CheckVerifyFault(new CheckFaultBean("Division par 0"), "Fault Detected");
        }catch(Exception e){
            if(e instanceof CheckVerifyFault)
                throw e;
            else throw new CheckVerifyFault(new CheckFaultBean("Exception"), "Fault Detected", e);
        }
        
        return entier1/entier2;
    }
}
