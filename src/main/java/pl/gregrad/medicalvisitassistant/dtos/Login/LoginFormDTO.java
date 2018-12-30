package pl.gregrad.medicalvisitassistant.dtos.Login;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class LoginFormDTO {

    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String login;
    @NotNull @NotBlank (message = "Pole nie może być puste")
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
