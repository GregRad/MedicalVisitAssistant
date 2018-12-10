package pl.gregrad.medicalvisitassistant.dtos.Basic;


import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class VisitDTO {


    private Long id;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime visitDate;
    @NotNull @NotBlank
    private Integer charge;
    @NotNull @NotBlank
    private String visitDescription;
    @NotNull @NotBlank
    private Long patientId;
    @NotNull @NotBlank
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
