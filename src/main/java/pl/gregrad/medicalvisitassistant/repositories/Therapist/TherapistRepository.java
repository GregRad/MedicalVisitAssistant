package pl.gregrad.medicalvisitassistant.repositories.Therapist;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.gregrad.medicalvisitassistant.entity.Basic.Therapist.Therapist;


@Repository
public interface TherapistRepository extends JpaRepository<Therapist, Long> {

    /*
        Pamiętaj, że to zapytanie jest błędne i chyba je przerabialiśmy
        na zajęciach na inne :)
        Spójrz na zapytanie `checkCredentials` jak jest zrobione. Nie jest to MUST-HAVE, ale warto
        przerobić aby było podobne do tamtego.
     */
    @Query("SELECT true FROM Therapist t WHERE t.login = :login")
    Boolean isLoginUsed(@Param("login") String login);

    /*
        Uwaga jak wyżej :)
     */
    @Query("SELECT true FROM Therapist t WHERE t.email = :email")
    Boolean isEmailUsed(@Param("email") String email);

    Therapist findByLogin(String login);
}

