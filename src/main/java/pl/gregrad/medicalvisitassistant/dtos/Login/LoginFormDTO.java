package pl.gregrad.medicalvisitassistant.dtos.Login;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/*
    Bardzo dobrze, że skorzystałeś z dedykowanych DTO pod procesy.
    Zadbaj jeszcze o poprawne User Experience podczas walidacji formularzy
    i dodaj do adnotacji walidacyjnych wiadomości walidacyjne.
    Używasz tych klas w konkretnych procesach, więc nie powinno to specjalnie zaśmiecić kodu,
    a jest niezbędne, więc... nie masz specjalnie wyboru :)

    Powyższe tyczy się też wszystkich pozostałych DTOs

    Pamiętaj również o metodach equals, hashCode i toString - je należy tworzyć w każdej klasie,
    która nie jest klasą usługową, a jest klasą reprezentacyjną. Możesz zastosować taką regułę:
    - jeżeli istnieje szansa, że obiekt tej klasy dodam kiedykolwiek do kolekcji, to implementuje
    metody equasl i hashCode
    - jeżeli w obiekcie tej klasy najważniejsze są pola, a nie metody, to implementuje toString()
 */
public class LoginFormDTO {

    @NotNull @NotBlank
    private String login;
    @NotNull @NotBlank
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
