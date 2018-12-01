package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;

import java.util.List;

public interface VisitRepository extends JpaRepository <Visit, Long> {


    List<Visit> findByPatientId (Long id);
}
