/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Service.Implementation.DiagnosisServiceImp;
import Service.Implementation.PatientServiceImp;
import Service.Implementation.TherapistServiceImp;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Kebean
 */
public class MyServerCenter {
    public static void main(String[] args){
        try{
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.rebind("therapy", new TherapistServiceImp());
            registry.rebind("patient", new PatientServiceImp());
            registry.rebind("diagnosis", new DiagnosisServiceImp());
            System.out.println("Server is listening on port 5000...");
            Thread.currentThread().join();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
