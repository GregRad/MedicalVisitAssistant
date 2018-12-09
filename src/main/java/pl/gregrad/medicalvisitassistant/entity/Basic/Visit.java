package pl.gregrad.medicalvisitassistant.entity.Basic;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Visit")
public class Visit {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime visitDate;
    private Integer charge;
    private String visitDescription;
    private String patientDetails;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Patient patient;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public String getVisitDescription() {
        return visitDescription;
    }

    public void setVisitDescription(String visitDescription) {
        this.visitDescription = visitDescription;
    }

    public String getPatientDetails() { return patientDetails; }

    public void setPatientDetails(String patientDetails) { this.patientDetails = patientDetails;
    }
    public Patient getPatient() { return patient; }

    public void setPatient(Patient patient) { this.patient = patient; }

}
