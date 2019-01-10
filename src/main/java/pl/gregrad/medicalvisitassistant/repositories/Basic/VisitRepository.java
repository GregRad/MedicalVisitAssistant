package pl.gregrad.medicalvisitassistant.repositories.Basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;

import java.time.LocalDateTime;
import java.util.List;

public interface VisitRepository extends JpaRepository <Visit, Long> {

    @Query("SELECT v FROM Visit v WHERE MONTH(v.visitDate) = :visitDate")
    List<Visit> findByVisitDate (@Param("visitDate") Integer visitDate);

    List<Visit> findByPatientId (Long id);
}
