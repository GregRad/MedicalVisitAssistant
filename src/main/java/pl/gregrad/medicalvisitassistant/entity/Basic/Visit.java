package pl.gregrad.medicalvisitassistant.entity.Basic;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Visit")
public class Visit {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime visitDate;
    private Integer charge;
    private String visitDescription;
    @ManyToOne
    private PatientCard patient;


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

    public PatientCard getPatient() {
        return patient;
    }
    public void setPatient(PatientCard patient) {
        this.patient = patient;
    }
}
