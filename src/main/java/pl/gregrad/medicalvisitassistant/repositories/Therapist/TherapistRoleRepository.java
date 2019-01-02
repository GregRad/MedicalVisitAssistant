package pl.gregrad.medicalvisitassistant.repositories.Therapist;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Therapist.TherapistRole;

public interface TherapistRoleRepository extends JpaRepository<TherapistRole, Long> {
}
