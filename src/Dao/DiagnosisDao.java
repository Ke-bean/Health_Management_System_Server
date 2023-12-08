/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Diagnosis;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Kebean
 */
public class DiagnosisDao {
    public Diagnosis registerDiagnosis(Diagnosis diagnosis){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(diagnosis);
            ss.beginTransaction().commit();
            ss.close();
            return diagnosis;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
       public Diagnosis updateDiagnosis(Diagnosis diagnosis){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(diagnosis);
            ss.beginTransaction().commit();
            ss.close();
            return diagnosis;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
       public Diagnosis deleteDiagnosis(Diagnosis diagnosis){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(diagnosis);
            ss.beginTransaction().commit();
            ss.close();
            return diagnosis;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Diagnosis searchDiagnosis(Diagnosis diagnosis){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Diagnosis theDiagnosis = (Diagnosis)ss.get(Diagnosis.class, diagnosis.getDiagnosisId());
            ss.close();
            return theDiagnosis;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Diagnosis> allDiagnosis(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Diagnosis> diagnosiss = ss.createQuery("select diagnosis from Diagnosis diagnosis").list();
            ss.close();
            return diagnosiss;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
