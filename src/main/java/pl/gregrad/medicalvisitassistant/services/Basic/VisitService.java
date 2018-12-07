package pl.gregrad.medicalvisitassistant.services.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientCard;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientCardRepository;
import pl.gregrad.medicalvisitassistant.repositories.Basic.VisitRepository;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class VisitService {

    @Autowired
    private VisitRepository visitRepository;


    public List<VisitDTO> findAllVisit() {
        List<Visit> visits = visitRepository.findAll();
        List<VisitDTO> allVisits = new ArrayList<>();
        for ( Visit v : visits) {
            if (v.getPatient() == null) {
                continue;
            }
            VisitDTO visitData = new VisitDTO();
            visitData.setId(v.getId());
            visitData.setVisitDate(v.getVisitDate());
            visitData.setCharge(v.getCharge());
            visitData.setVisitDescription(v.getVisitDescription());
            visitData.setPatientDetails(v.getPatient().getName()
                    + " " + v.getPatient().getSurname());
            visitData.setPatientId(v.getPatient().getId());
            allVisits.add(visitData);
        }
        return allVisits;
    }

    public VisitDTO findById (Long id) {
        Visit visitById = visitRepository.findOne(id);
        VisitDTO patientVisit = new VisitDTO();
        patientVisit.setVisitDate(visitById.getVisitDate());
        patientVisit.setCharge(visitById.getCharge());
        patientVisit.setVisitDescription(visitById.getVisitDescription());

        return patientVisit;
    }

    public List<VisitDTO> findByPatientId (Long id){
        List<Visit> patientVisits = visitRepository.findByPatientId(id);
        List<VisitDTO> visitByPatient = new ArrayList<>();
        for ( Visit v : patientVisits) {
            VisitDTO patientVisit = new VisitDTO();
            patientVisit.setVisitDate(v.getVisitDate());
            patientVisit.setCharge(v.getCharge());
            patientVisit.setVisitDescription(v.getVisitDescription());

        }
        return visitByPatient;
    }

    public void delete (Long id) {
        visitRepository.delete(visitRepository.findOne(id));
    }

    public void edit (VisitDTO visit) {
        Visit editVisit = visitRepository.findOne(visit.getId());
        editVisit.setVisitDescription(visit.getVisitDescription());
        editVisit.setCharge(visit.getCharge());
        editVisit.setVisitDate(visit.getVisitDate());
        visitRepository.save(editVisit);
    }
}
