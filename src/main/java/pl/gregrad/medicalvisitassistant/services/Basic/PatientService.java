package pl.gregrad.medicalvisitassistant.services.Basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientCard;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientDetails;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientCardRepository;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientDetailsRepository;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientDetailsRepository patientDetailsRepository;

    @Autowired
    private PatientCardRepository patientCardRepository;

    public List<PatientDTO> findAllPatients() {
        List<Patient> patient = patientRepository.findAll();
        List<PatientDTO> allPatients = new ArrayList<>();
        for (Patient p : patient) {
            PatientDTO patientData = new PatientDTO();
            patientData.setId(p.getId());
            patientData.setName(p.getName());
            patientData.setSurname(p.getSurname());
        }
    return allPatients;
    }
    public Patient findById(Long id) {
        return patientRepository.findOne(id);
    }
    public PatientDTO getPatientDetails(Long id){
        PatientDetails patient = patientDetailsRepository.findOne(id);
        PatientDTO patientDetails = new PatientDTO();
        patientDetails.setId(patient.getPatient().getId());
        patientDetails.setAddress(patient.getAddress());
        patientDetails.setHouseNumber(patient.getHouseNumber());
        patientDetails.setApartmentNumber(patient.getApartmentNumber());
        patientDetails.setPhoneNumber(patient.getPhoneNumber());
        patientDetails.setEmail(patient.getEmail());

        return patientDetails;
    }
    public PatientDTO getPatientCard(Long id) {
        PatientCard patient = patientCardRepository.findOne(id);
        PatientDTO patientCard = new PatientDTO();
        patientCard.setId(patient.getPatient().getId());
        patientCard.setExam(patient.getExam());
        patientCard.setDiagnosis(patient.getDiagnosis());
        patientCard.setSymptoms(patient.getSymptoms());
        patientCard.setDiseases(patient.getDiseases());
        patientCard.setRehab(patient.getRehab());
        patientCard.setFunctioning(patient.getFunctioning());
        patientCard.setMedicines(patient.getMedicines());
        patientCard.setProcedures(patient.getProcedures());
        patientCard.setDrugs(patient.getDrugs());

        return patientCard;
    }
    public void delete(Long id) {
        patientRepository.delete(patientRepository.findOne(id));
        patientDetailsRepository.delete(patientDetailsRepository.findOne(id));
        patientCardRepository.delete(patientCardRepository.findOne(id));
    }
    public void editPatient(PatientDTO patient) {
        Patient editPatient = patientRepository.findOne(patient.getId());
        patientRepository.save(editPatient);
    }
    public void editPatientDetails(PatientDTO patientDetails) {
        PatientDetails editPatientDetails = patientDetailsRepository.findOne(patientDetails.getId());
        patientDetailsRepository.save(editPatientDetails);
    }
    public void editPatientCard (PatientDTO patientCard) {
        PatientCard editPatientCard = patientCardRepository.findOne(patientCard.getId());
        patientCardRepository.save(editPatientCard);
    }
}