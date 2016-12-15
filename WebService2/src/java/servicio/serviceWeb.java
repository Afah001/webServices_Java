/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Anderson
 */
@WebService(serviceName = "serviceWeb")
public class serviceWeb {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "edad")
    public String edad(@WebParam(name = "edad") String edad) {
        //TODO write your implementation code here:
        
        int edadConvertida=Integer.parseInt(edad);

        if (edadConvertida>=18) {
             return "Eres mayor de edad";
        }else{
            return "No eres mayor de edad";
        }
 
    }
    
    
    
    
}
