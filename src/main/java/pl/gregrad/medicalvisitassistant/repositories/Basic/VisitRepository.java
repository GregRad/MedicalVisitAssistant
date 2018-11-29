package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Long> {

    /*
        Podobnie jak w PatientRepository - findAll i findById do usunięcia :)
     */
    List<Visit> findAll ();
    Visit findById (Long id);
    /*
        Na encjach masz relację `@OneToOne`, która jest oczywiście do zmiany,
        ale z taką relacją nie masz szans znaleźć listy wizyt dla pacjenta.
     */
    List<Visit> findByPatientId (Long id);
}
