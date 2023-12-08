/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;

import Dao.DiagnosisDao;
import Model.Diagnosis;
import Service.DiagnosisService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Kebean
 */
public class DiagnosisServiceImp extends UnicastRemoteObject implements DiagnosisService{
     public DiagnosisServiceImp() throws RemoteException{
        
    }
     DiagnosisDao dao = new DiagnosisDao();

    @Override
    public Diagnosis registerDiagnosis(Diagnosis diagnosis) throws RemoteException {
        return dao.registerDiagnosis(diagnosis);
    }

    @Override
    public Diagnosis updateDiagnosis(Diagnosis diagnosis) throws RemoteException {
        return dao.updateDiagnosis(diagnosis);
    }

    @Override
    public Diagnosis deleteDiagnosis(Diagnosis diagnosis) throws RemoteException {
        return dao.deleteDiagnosis(diagnosis);
    }

    @Override
    public Diagnosis searchDiagnosis(Diagnosis diagnosis) throws RemoteException {
        return dao.searchDiagnosis(diagnosis);
    }

    @Override
    public List<Diagnosis> allDiagnosis() throws RemoteException {
        return dao.allDiagnosis();
    }
    
}
