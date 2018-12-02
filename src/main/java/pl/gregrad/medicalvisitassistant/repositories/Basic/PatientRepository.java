package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;

<<<<<<< HEAD
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    List<Patient> findAll();
    Patient findById(Long id);

=======
public interface PatientRepository extends JpaRepository<Patient, Long> {
>>>>>>> 718229d91fa0c7189b116e7f54391e50fcd53bfb
}
