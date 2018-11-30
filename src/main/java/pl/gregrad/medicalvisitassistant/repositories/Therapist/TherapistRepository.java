package pl.gregrad.medicalvisitassistant.repositories.Therapist;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.gregrad.medicalvisitassistant.entity.Therapist.Therapist;


@Repository
public interface TherapistRepository extends JpaRepository<Therapist, Long> {

    @Query("SELECT true FROM Therapist t WHERE t.login = :login")
    Boolean isLoginUsed(@Param("login") String login);

    @Query("SELECT true FROM Therapist t WHERE t.email = :email")
    Boolean isEmailUsed(@Param("email") String email);

    Therapist findByLogin(String login);
}

