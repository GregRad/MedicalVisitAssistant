package pl.gregrad.medicalvisitassistant.dtos.Registration;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class RegistrationFormDTO {

    @NotNull @NotBlank (message = "Pole nie może być puste") @Size(min = 5, max = 20, message = "Login musi mieć od 5 do 20 znaków" )
    private String login;
    @NotNull @NotBlank (message = "Pole nie może być puste") @Email (message = "Niepoprawny email")
    private String email;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String password;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String confirmedPassword;
    @NotNull @NotBlank (message = "Pole nie może być puste") @Size(min = 3, message = "Imię musi być dłuższe niż 3 znaki" )
    private String firstName;
    @NotNull @NotBlank (message = "Pole nie może być puste") @Size(min = 3, message = "Imię musi być dłuższe niż 3 znaki" )
    private String lastName;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationFormDTO that = (RegistrationFormDTO) o;
        return Objects.equals(login, that.login) &&
                Objects.equals(email, that.email) &&
                Objects.equals(password, that.password) &&
                Objects.equals(confirmedPassword, that.confirmedPassword) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, password, confirmedPassword, firstName, lastName);
    }

    @Override
    public String toString() {
        return "RegistrationFormDTO{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmedPassword='" + confirmedPassword + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
