package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;

import java.util.List;

public interface VisitRepository extends JpaRepository <Visit, Long> {

<<<<<<< HEAD
    List<Visit> findAll ();
    Visit findById (Long id);
=======

>>>>>>> 718229d91fa0c7189b116e7f54391e50fcd53bfb
    List<Visit> findByPatientId (Long id);
}
