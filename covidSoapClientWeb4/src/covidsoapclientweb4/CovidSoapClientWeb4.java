/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclientweb4;

import services.Coviddata;

/**
 *
 * @author athap
 */
public class CovidSoapClientWeb4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coviddata cv = findById(3);
        System.out.print(cv.getTotalCase());
        
        System.out.println(hello("athapong"));
    }

    private static Coviddata findById(int id) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.findById(id);
    }

    private static String hello(java.lang.String name) {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.hello(name);
    }
    
    
}
