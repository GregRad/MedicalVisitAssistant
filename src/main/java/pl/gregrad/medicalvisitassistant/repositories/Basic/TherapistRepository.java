package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Therapist.Therapist;

public interface TherapistRepository extends JpaRepository<Therapist, Long> {
}
