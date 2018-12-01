package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientDetails;

public interface PatientDetailsRepository extends JpaRepository <PatientDetails, Long> {
}
