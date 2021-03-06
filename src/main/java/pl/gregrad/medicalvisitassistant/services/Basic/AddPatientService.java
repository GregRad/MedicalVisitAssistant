package pl.gregrad.medicalvisitassistant.services.Basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientDetails;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientCard;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientCardRepository;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientDetailsRepository;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientRepository;

import javax.transaction.Transactional;

@Service
@Transactional
public class AddPatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientDetailsRepository patientDetailsRepository;

    @Autowired
    private PatientCardRepository patientCardRepository;

    public void addPatient(PatientDTO form) {

        Patient newPatient = new Patient();
        newPatient.setName(form.getName());
        newPatient.setSurname(form.getSurname());
        patientRepository.save(newPatient);

        PatientDetails newPatientDetails = new PatientDetails();
        newPatientDetails.setAddress(form.getAddress());
        newPatientDetails.setHouseNumber(form.getHouseNumber());
        newPatientDetails.setApartmentNumber(form.getApartmentNumber());
        newPatientDetails.setPhoneNumber(form.getPhoneNumber());
        newPatientDetails.setEmail(form.getEmail());
        newPatientDetails.setPatient(newPatient);
        patientDetailsRepository.save(newPatientDetails);

        PatientCard newPatientCard = new PatientCard();
        newPatientCard.setExam(form.getExam());
        newPatientCard.setDiagnosis(form.getDiagnosis());
        newPatientCard.setSymptoms(form.getSymptoms());
        newPatientCard.setDiseases(form.getDiseases());
        newPatientCard.setRehab(form.getRehab());
        newPatientCard.setFunctioning(form.getFunctioning());
        newPatientCard.setMedicines(form.getMedicines());
        newPatientCard.setProcedures(form.getProcedures());
        newPatientCard.setDrugs(form.getDrugs());
        newPatientCard.setActivity(form.getActivity());
        newPatientCard.setPatientData(form.getName() + " " + form.getName());
        newPatientCard.setPatient(newPatient);
        patientCardRepository.save(newPatientCard);
    }
}
