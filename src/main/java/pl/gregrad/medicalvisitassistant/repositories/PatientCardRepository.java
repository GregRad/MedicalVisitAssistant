package pl.gregrad.medicalvisitassistant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.PatientCard;

public interface PatientCardRepository extends JpaRepository<PatientCard, Long> {

    PatientCard findByPatientId (Long id);
    PatientCard findByPatientName (String name);
}
