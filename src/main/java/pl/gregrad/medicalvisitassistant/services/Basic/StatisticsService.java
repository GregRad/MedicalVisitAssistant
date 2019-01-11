package pl.gregrad.medicalvisitassistant.services.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientRepository;
import pl.gregrad.medicalvisitassistant.repositories.Basic.VisitRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StatisticsService {

    @Autowired
    private VisitRepository visitRepository;

    @Autowired
    private PatientRepository patientRepository;

    public List<VisitDTO> findAll() {
        List<Visit> patientVisits = visitRepository.findAll();
        List<VisitDTO> visitByPatient = new ArrayList<>();
        for (Visit v : patientVisits) {
            VisitDTO patientVisit = new VisitDTO();
            patientVisit.setCharge(v.getCharge());
            visitByPatient.add(patientVisit);
        }
        return visitByPatient;

    }
    public List<VisitDTO> getByVisitDate(Integer visitDate) {
        List<Visit> findVisitByDate = visitRepository.findByVisitDate(visitDate);
        List<VisitDTO> allVisitsByDate = new ArrayList<>();
        for (Visit v : findVisitByDate) {
            VisitDTO visitsByDate = new VisitDTO();
            visitsByDate.setCharge(v.getCharge());
            allVisitsByDate.add(visitsByDate);
        }
        return allVisitsByDate;
    }

}
