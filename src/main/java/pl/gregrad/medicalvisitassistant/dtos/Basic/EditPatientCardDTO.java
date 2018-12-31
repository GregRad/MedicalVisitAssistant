package pl.gregrad.medicalvisitassistant.dtos.Basic;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditPatientCardDTO that = (EditPatientCardDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(diagnosis, that.diagnosis) &&
                Objects.equals(symptoms, that.symptoms) &&
                Objects.equals(diseases, that.diseases) &&
                Objects.equals(rehab, that.rehab) &&
                Objects.equals(functioning, that.functioning) &&
                Objects.equals(medicines, that.medicines) &&
                Objects.equals(procedures, that.procedures) &&
                Objects.equals(drugs, that.drugs) &&
                Objects.equals(exam, that.exam) &&
                Objects.equals(patientData, that.patientData) &&
                Objects.equals(activity, that.activity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, diagnosis, symptoms, diseases, rehab, functioning, medicines, procedures, drugs, exam, patientData, activity);
    }

    @Override
    public String toString() {
        return "EditPatientCardDTO{" +
                "id=" + id +
                ", diagnosis='" + diagnosis + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", diseases='" + diseases + '\'' +
                ", rehab='" + rehab + '\'' +
                ", functioning='" + functioning + '\'' +
                ", medicines='" + medicines + '\'' +
                ", procedures='" + procedures + '\'' +
                ", drugs='" + drugs + '\'' +
                ", exam='" + exam + '\'' +
                ", patientData='" + patientData + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }
}
