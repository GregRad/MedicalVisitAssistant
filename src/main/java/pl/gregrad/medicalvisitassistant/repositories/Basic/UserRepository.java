package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.Therapist.Therapist;

/*
    Masz TherapistRepository, więc to jest do usunięcia :)
 */
public interface UserRepository extends JpaRepository<Therapist, Long> {
}
