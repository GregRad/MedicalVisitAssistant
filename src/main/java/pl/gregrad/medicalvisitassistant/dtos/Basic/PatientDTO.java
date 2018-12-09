package pl.gregrad.medicalvisitassistant.dtos.Basic;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class PatientDTO {

    private Long id;
    @NotNull @NotBlank
    private String name;
    @NotNull @NotBlank
    private String surname;
    @NotNull @NotBlank
    private String address;
    @NotNull @NotBlank
    private String houseNumber;
    @NotNull @NotBlank
    private String apartmentNumber;
    @NotNull @NotBlank
    private String phoneNumber;
    private String email;
    @NotNull @NotBlank
    private String diagnosis;
    @NotNull @NotBlank
    private String symptoms;
    @NotNull @NotBlank
    private String diseases;
    @NotNull @NotBlank
    private String rehab;
    @NotNull @NotBlank
    private String functioning;
    @NotNull @NotBlank
    private String medicines;
    @NotNull @NotBlank
    private String procedures;
    @NotNull @NotBlank
    private String drugs;
    @NotNull @NotBlank
    private String exam;
    @NotNull @NotBlank
    private String patientData;
    @NotNull @NotBlank
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
}
