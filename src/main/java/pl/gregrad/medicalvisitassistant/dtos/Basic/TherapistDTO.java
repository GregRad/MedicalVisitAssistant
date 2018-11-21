package pl.gregrad.medicalvisitassistant.dtos.Basic;

import java.util.Objects;

public class TherapistDTO {

    private Long id;
    private String login;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TherapistDTO therapistDTO = (TherapistDTO) o;
        return Objects.equals(id, therapistDTO.id) &&
                Objects.equals(login, therapistDTO.login);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, login);
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
