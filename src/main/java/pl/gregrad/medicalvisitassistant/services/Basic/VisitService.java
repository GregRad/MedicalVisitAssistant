package pl.gregrad.medicalvisitassistant.services.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientDetails;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientRepository;
import pl.gregrad.medicalvisitassistant.repositories.Basic.VisitRepository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class VisitService {

    @Autowired
    private VisitRepository visitRepository;

    @Autowired
    private PatientRepository patientRepository;

    public void addVisit (VisitDTO visitForm) {

        String patientDetails = visitForm.getPatientDetails();
        LocalDateTime visitDate = visitForm.getVisitDate();
        Integer charge = visitForm.getCharge();
        String visitDescription = visitForm.getVisitDescription();

        Visit newVisit = new Visit();
        newVisit.setPatientDetails(patientDetails);
        newVisit.setVisitDate(visitDate);
        newVisit.setCharge(charge);
        newVisit.setVisitDescription(visitDescription);


        Patient patient = patientRepository.findById(visitForm.getPatientId());
        PatientDetails patient = patientRepository.findOne(visitForm.getPatientId());
        newVisit.setPatient(patient);

        visitRepository.save(newVisit);

    }
    public List<Visit> findAllVisit() {
        List<Visit> allPatients = visitRepository.findAll();
        for (Visit v : allPatients) {
            if (v.getPatient() == null) {
                continue;
            }
            v.setPatientDetails(v.getPatient().getName() + " " + v.getPatient().getSurname());
        }
        return allPatients;
    }
    public List<Visit> findByPatientId (Long id){
        List<Visit> patientVisits = visitRepository.findByPatientId(id);
        return patientVisits;
    }
    public VisitDTO findById(Long id){
         Visit entity = visitRepository.findById(id);
         Visit entity = visitRepository.findOne(id);
         VisitDTO newVisitEdit = new VisitDTO();
         newVisitEdit.setId(entity.getId());
         newVisitEdit.setVisitDate(entity.getVisitDate());
         newVisitEdit.setVisitDescription(entity.getVisitDescription());
         newVisitEdit.setCharge(entity.getCharge());

         return newVisitEdit;
    }
    public void delete (Long id) {
        visitRepository.delete(visitRepository.findById(id));
    }

    public void edit (VisitDTO visit) {
        Visit entit = visitRepository.findById(visit.getId());
        visitRepository.delete(visitRepository.findOne(id));
    }

    public void edit (VisitDTO visit) {
        Visit entit = visitRepository.findOne(visit.getId());
        entit.setVisitDescription(visit.getVisitDescription());
        entit.setCharge(visit.getCharge());
        entit.setVisitDate(visit.getVisitDate());
        visitRepository.save(entit);
    }
}
