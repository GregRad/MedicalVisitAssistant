package pl.gregrad.medicalvisitassistant.dtos.Basic;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;

public class VisitDTO {


    private Long id;
    @NotNull (message = "Pole nie moze byc puste")
    @DateTimeFormat (pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime visitDate;
    @NotNull @NotBlank(message = "Pole nie może być puste")
    @Digits (integer = 6, fraction = 1, message = "Wartość musi być liczbą")
    private String charge;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String visitDescription;
    private Long patientId;
    private String patientDetails;


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

    public void setPatientDetails(String patientDetails) { this.patientDetails = patientDetails; }

    public Long getPatientId() { return patientId; }

    public void setPatientId(Long patientId) { this.patientId = patientId; }

    @Override
    public String toString() {
        return "VisitDTO{" +
                "id=" + id +
                ", visitDate=" + visitDate +
                ", charge=" + charge +
                ", visitDescription='" + visitDescription + '\'' +
                ", patientId=" + patientId +
                ", patientDetails='" + patientDetails + '\'' +
                '}';
    }
}
