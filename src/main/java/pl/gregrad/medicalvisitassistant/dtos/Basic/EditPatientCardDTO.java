package pl.gregrad.medicalvisitassistant.dtos.Basic;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class EditPatientCardDTO {

    private Long id;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
    private String diagnosis;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String symptoms;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String diseases;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String rehab;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String functioning;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String medicines;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String procedures;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String drugs;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String exam;
    private String patientData;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String activity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public String getRehab() {
        return rehab;
    }

    public void setRehab(String rehab) {
        this.rehab = rehab;
    }

    public String getFunctioning() {
        return functioning;
    }

    public void setFunctioning(String functioning) {
        this.functioning = functioning;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public String getProcedures() {
        return procedures;
    }

    public void setProcedures(String procedures) {
        this.procedures = procedures;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getPatientData() {
        return patientData;
    }

    public void setPatientData(String patientData) {
        this.patientData = patientData;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
