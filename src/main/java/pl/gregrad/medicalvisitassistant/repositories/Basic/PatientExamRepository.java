package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientExam;

public interface PatientExamRepository extends JpaRepository <PatientExam, Long> {


}
