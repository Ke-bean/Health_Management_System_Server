/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;

import Dao.TherapistDao;
import Model.Therapist;
import Service.TherapistService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Kebean
 */
public class TherapistServiceImp extends UnicastRemoteObject implements TherapistService{
     public TherapistServiceImp() throws RemoteException{
        
    }
     TherapistDao dao = new TherapistDao();

    @Override
    public Therapist registerTherapist(Therapist therapist) throws RemoteException {
        return dao.registerTherapist(therapist);
    }

    @Override
    public Therapist updateTherapist(Therapist therapist) throws RemoteException {
        return dao.updateTherapist(therapist);
    }

    @Override
    public Therapist deleteTherapist(Therapist therapist) throws RemoteException {
        return dao.deleteTherapist(therapist);
    }

    @Override
    public Therapist searchTherapist(Therapist therapist) throws RemoteException {
        return dao.searchTherapist(therapist);
    }

    @Override
    public List<Therapist> allTherapist() throws RemoteException {
        return dao.allTherapist();
    }
    
}
