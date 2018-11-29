package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    /*
        Usuń obie te metody, bo dostajesz je bazowo z JpaRepository, nie musisz
        ich dodatkowo nazywać. Pierwsza nazywa się wprost `findAll` a druga `findOne`.
        Używaj tych metod, bo będą wydajniejsze :)
     */
    List<Patient> findAll();
    Patient findById(Long id);

}
