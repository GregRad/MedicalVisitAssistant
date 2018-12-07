package pl.gregrad.medicalvisitassistant.entity.Basic;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Patient")
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    @OneToMany(mappedBy = "patient", cascade = CascadeType.REMOVE)
    private List<Visit> visit;
    @OneToOne(mappedBy = "patient", cascade = CascadeType.REMOVE)
    private PatientCard patientCard;
    @OneToOne(mappedBy = "patient", cascade = CascadeType.REMOVE)
    private PatientDetails patientDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public List<Visit> getVisit() {
        return visit;
    }

    public void setVisit(List<Visit> visit) {
        this.visit = visit;
    }

    public PatientCard getPatientCard() { return patientCard;
    }
    public void setPatientCard(PatientCard patientCard) { this.patientCard = patientCard;
    }

    public PatientDetails getPatientDetails() { return patientDetails; }

    public void setPatientDetails(PatientDetails patientDetails) { this.patientDetails = patientDetails; }
}
