package pl.gregrad.medicalvisitassistant.entity.Basic;

<<<<<<< HEAD
=======
import org.hibernate.mapping.ToOne;

>>>>>>> 718229d91fa0c7189b116e7f54391e50fcd53bfb
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Visit")
public class Visit {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Transient
    private String patientDetails;
    private LocalDateTime visitDate;
    private Integer charge;
    private String visitDescription;
<<<<<<< HEAD
    @OneToOne
    private Patient patient;
=======
    @ManyToOne
    private PatientDetails patient;
>>>>>>> 718229d91fa0c7189b116e7f54391e50fcd53bfb

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

    public String getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(String paatientDetails) {
        this.patientDetails = paatientDetails;
    }

<<<<<<< HEAD
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
=======
    public PatientDetails getPatient() {
        return patient;
    }

    public void setPatient(PatientDetails patient) {
>>>>>>> 718229d91fa0c7189b116e7f54391e50fcd53bfb
        this.patient = patient;
    }
}
