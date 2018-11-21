package pl.gregrad.medicalvisitassistant.repositories.Therapist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gregrad.medicalvisitassistant.entity.Basic.Therapist.TherapistDetails;

@Repository
public interface TherapistDetailsRepository extends JpaRepository<TherapistDetails, Long> {
}
