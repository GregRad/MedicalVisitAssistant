package pl.gregrad.medicalvisitassistant.dtos.Basic;

import org.hibernate.validator.constraints.NotBlank;
import org.sonatype.inject.Nullable;

import javax.validation.constraints.*;
import java.util.Objects;

public class PatientDTO {

    private Long id;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String name;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String surname;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String address;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String houseNumber;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String apartmentNumber;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    @Pattern(regexp="[\\d]{6}", message = "Niepoprawny format numeru telefonu")
    private String phoneNumber;
    @Email (message = "Niepoprawny email")
    private String email;

    @NotNull @NotBlank (message = "Pole nie może być puste")
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getDrugs() {
        return drugs;
    }

    public void setDrugs(String drugs) {
        this.drugs = drugs;
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
        PatientDTO that = (PatientDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(address, that.address) &&
                Objects.equals(houseNumber, that.houseNumber) &&
                Objects.equals(apartmentNumber, that.apartmentNumber) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(email, that.email) &&
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
        return Objects.hash(id, name, surname, address, houseNumber, apartmentNumber, phoneNumber, email, diagnosis, symptoms, diseases, rehab, functioning, medicines, procedures, drugs, exam, patientData, activity);
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
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
