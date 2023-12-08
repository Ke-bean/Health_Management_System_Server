/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;

import Dao.PatientDao;
import Model.Patient;
import Service.PatientService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Kebean
 */
public class PatientServiceImp extends UnicastRemoteObject implements PatientService{
    public PatientServiceImp() throws RemoteException{
        
    }
    PatientDao dao = new PatientDao();
    @Override
    public Patient registerPatient(Patient patient) throws RemoteException {
        return dao.registerPatient(patient);
    }

    @Override
    public Patient updatePatient(Patient patient) throws RemoteException {
        return dao.updatePatient(patient);
    }

    @Override
    public Patient deletePatient(Patient patient) throws RemoteException {
        return dao.deletePatient(patient);
    }

    @Override
    public Patient searchPatient(Patient patient) throws RemoteException {
        return dao.searchPatient(patient);
    }

    @Override
    public List<Patient> allPatient() throws RemoteException {
        return dao.allPatient();
    }
    
}
