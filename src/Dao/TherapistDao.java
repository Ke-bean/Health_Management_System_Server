/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Model.Therapist;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Kebean
 */
public class TherapistDao {
    public Therapist registerTherapist(Therapist therapist){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(therapist);
            ss.beginTransaction().commit();
            ss.close();
            return therapist;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
       public Therapist updateTherapist(Therapist therapist){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(therapist);
            ss.beginTransaction().commit();
            ss.close();
            return therapist;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
       public Therapist deleteTherapist(Therapist therapist){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(therapist);
            ss.beginTransaction().commit();
            ss.close();
            return therapist;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Therapist searchTherapist(Therapist therapist){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Therapist theTherapist = (Therapist)ss.get(Therapist.class, therapist.getTherapistId());
            ss.close();
            return theTherapist;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Therapist> allTherapist(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Therapist> therapists = ss.createQuery("select therapist from Therapist therapist").list();
            ss.close();
            return therapists;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
