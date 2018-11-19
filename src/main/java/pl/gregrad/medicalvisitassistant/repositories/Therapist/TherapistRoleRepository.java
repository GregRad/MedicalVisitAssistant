package pl.gregrad.medicalvisitassistant.repositories.Therapist;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.gregrad.medicalvisitassistant.entity.Therapist.TherapistRole;


@Repository
public interface TherapistRoleRepository extends JpaRepository<TherapistRole, Long> {
}