package pl.gregrad.medicalvisitassistant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.gregrad.medicalvisitassistant.entity.Visit;

import java.util.List;

public interface VisitRepository extends JpaRepository <Visit, Long> {

    List<Visit> findAll ();
    Visit findById (Long id);
}
