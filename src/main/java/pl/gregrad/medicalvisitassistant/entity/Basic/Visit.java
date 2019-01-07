package pl.gregrad.medicalvisitassistant.entity.Basic;




import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "Visit")
public class Visit {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime visitDate;
    private String charge;
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

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
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
