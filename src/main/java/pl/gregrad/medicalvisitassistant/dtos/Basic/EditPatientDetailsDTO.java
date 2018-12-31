package pl.gregrad.medicalvisitassistant.dtos.Basic;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class EditPatientDetailsDTO {

    private Long id;
    @NotNull
    @NotBlank(message = "Pole nie może być puste")
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
    @Email(message = "Niepoprawny email")
    private String email;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EditPatientDetailsDTO that = (EditPatientDetailsDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname) &&
                Objects.equals(address, that.address) &&
                Objects.equals(houseNumber, that.houseNumber) &&
                Objects.equals(apartmentNumber, that.apartmentNumber) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, address, houseNumber, apartmentNumber, phoneNumber, email);
    }

    @Override
    public String toString() {
        return "EditPatientDetailsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
