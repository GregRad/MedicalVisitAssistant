package pl.gregrad.medicalvisitassistant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Therapist.Therapist;

public interface UserRepository extends JpaRepository<Therapist, Long> {
}
