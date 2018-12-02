package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientCard;

public interface PatientCardRepository extends JpaRepository <PatientCard, Long> {

}
