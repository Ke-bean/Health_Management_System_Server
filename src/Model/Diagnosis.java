/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author Kebean
 */
@Entity
public class Diagnosis implements Serializable{
    @Id
    @Column(name = "diagnosis_id")
    private Integer diagnosisId;
    private Date date = new Date();
    @OneToOne
    @JoinColumn(name = "therapist_id")
    private Therapist therapist;
    @OneToMany(mappedBy = "diagnosis")
    List<Patient> patients = new ArrayList<>();

    public Diagnosis() {
    }

    public Diagnosis(Integer diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public Diagnosis(Integer diagnosisId, Therapist therapist) {
        this.diagnosisId = diagnosisId;
        this.therapist = therapist;
    }

    public Integer getDiagnosisId() {
        return diagnosisId;
    }

    public void setDiagnosisId(Integer diagnosisId) {
        this.diagnosisId = diagnosisId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Therapist getTherapist() {
        return therapist;
    }

    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    
}
