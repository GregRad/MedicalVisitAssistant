package pl.gregrad.medicalvisitassistant.services.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientCard;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientCardRepository;
import pl.gregrad.medicalvisitassistant.repositories.Basic.VisitRepository;
import javax.transaction.Transactional;


@Service
@Transactional
public class AddVisitService {

    @Autowired
    private VisitRepository visitRepository;

    @Autowired
    private PatientCardRepository patientCardRepository;

    public void addVisit (VisitDTO form) {

        Visit newVisit = new Visit();
        newVisit.setVisitDate(form.getVisitDate());
        newVisit.setCharge(form.getCharge());
        newVisit.setVisitDescription(form.getVisitDescription());

        PatientCard patient = patientCardRepository.findOne(form.getPatientId());
        newVisit.setPatient(patient);

        visitRepository.save(newVisit);
    }
}
