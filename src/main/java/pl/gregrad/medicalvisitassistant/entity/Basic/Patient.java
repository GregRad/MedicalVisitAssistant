package pl.gregrad.medicalvisitassistant.entity.Basic;


import javax.persistence.*;

/*
    Rozbij tą klasę koniecznie na dwie osobne encje.
    Zrób jedną encjęz danymi pacjenta. Możesz już z tego nawet nie wydzielać
    danych adresowych i kontaktowych, tylko zostawić jak jest.
    Natomiast koniecznie dorzuć klasę reprezentującą kartę pacjenta
    z całym tym zestawem dodatkowych pól.

    Zarówno na poziomie obiektowym, jak i na poziomie tabeli, klasa/tabela, która ma
    tak dużo kolumn jest wielkim smrodem :)

    Jak to rozbijesz, to nie będziesz też czuł się zniechęcony do dorzucenia adnotacji @Column,
    aby nazwy kolumn na tabeli tworzyły się bez CamelCase tylko underscore_non_case ;)
 */
@Entity
@Table(name = "Patient")
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String address;
    private String houseNumber;
    private String apartmentNumber;
    private String phoneNumber;
    private String email;

    private String exam;
    private String diagnosis;
    private String symptoms;
    private String diseases;
    /*
        Domyślnym typem, który Ci Hibernate stworzy będzie varchar(255) znaków.
        Zastanów się czy te 255 znaków w każdym polu będzie wystarczające.
        Jak nie to ustaw na poziomie @Column inną długość albo wskaż typ docelowy TEXT
     */
    private String rehab;
    private String functioning;
    private String medicines;
    private String procedures;
    private String drugs;
    /*
        Na pewno tutaj jest złe mapowanie.
        Powinniśmy mieć mapowanie @OneToMany ponieważ jeden pacjent
        może mieć przecież wiele wizyt, a nie tylko pojedynczą.

        Mogą z tego wyjść spore zmiany w aplikacji, ale tak to zostać niestety nie może :(
     */
    @OneToOne(mappedBy = "patient", cascade = CascadeType.REMOVE)
    private Visit visit;


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

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
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

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }
}
