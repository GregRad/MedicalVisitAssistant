package pl.gregrad.medicalvisitassistant.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Patient_card")
public class PatientCard {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medicalExam;
    @OneToOne
    private Patient patient;
    @ManyToOne
    private Visit visit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedicalExam() {
        return medicalExam;
    }

    public void setMedicalExam(String medicalExam) {
        this.medicalExam = medicalExam;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }
}
