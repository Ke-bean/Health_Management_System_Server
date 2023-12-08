/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Patient;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Kebean
 */
public class PatientDao {
    public Patient registerPatient(Patient patient){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(patient);
            ss.beginTransaction().commit();
            ss.close();
            return patient;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
       public Patient updatePatient(Patient patient){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(patient);
            ss.beginTransaction().commit();
            ss.close();
            return patient;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
       public Patient deletePatient(Patient patient){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(patient);
            ss.beginTransaction().commit();
            ss.close();
            return patient;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Patient searchPatient(Patient patient){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Patient thePatient = (Patient)ss.get(Patient.class, patient.getPatientId());
            ss.close();
            return thePatient;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Patient> allPatient(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Patient> patients = ss.createQuery("select patient from Patient patient").list();
            ss.close();
            return patients;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
