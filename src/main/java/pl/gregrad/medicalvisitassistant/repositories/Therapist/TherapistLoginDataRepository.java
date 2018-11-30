package pl.gregrad.medicalvisitassistant.repositories.Therapist;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.gregrad.medicalvisitassistant.entity.Therapist.TherapistLogInData;


@Repository
public interface TherapistLoginDataRepository extends JpaRepository<TherapistLogInData, Long> {

    @Query("SELECT CASE WHEN count(tld.id) > 0 THEN true ELSE false END " +
            "FROM TherapistLogInData tld WHERE tld.therapist.login = :login AND tld.password = :password")
    Boolean checkCredentials(@Param("login") String login, @Param("password") String password);
}
