package pl.gregrad.medicalvisitassistant.services.Basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientDTO;
import pl.gregrad.medicalvisitassistant.dtos.Basic.EditPatientCardDTO;
import pl.gregrad.medicalvisitassistant.dtos.Basic.EditPatientDetailsDTO;
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
            allPatients.add(patientData);
        }

    return allPatients;
    }
    public PatientDTO findPatientById(Long id) {
        Patient patient = patientRepository.findOne(id);
        PatientDetails patientDetails = patientDetailsRepository.findOne(id);
        PatientDTO findPatient = new PatientDTO();
        findPatient.setId(patient.getId());
        findPatient.setName(patient.getName());
        findPatient.setSurname(patient.getSurname());
        findPatient.setAddress(patientDetails.getAddress());
        findPatient.setHouseNumber(patientDetails.getHouseNumber());
        findPatient.setApartmentNumber(patientDetails.getApartmentNumber());
        findPatient.setPhoneNumber(patientDetails.getPhoneNumber());
        findPatient.setEmail(patientDetails.getEmail());

        return findPatient;
    }
    public PatientDTO findPatientCardById(Long id) {
        PatientCard patientCard = patientCardRepository.findOne(id);
        PatientDTO findCardPatient = new PatientDTO();
        findCardPatient.setId(patientCard.getPatient().getId());
        findCardPatient.setPatientData(patientCard.getPatient().getName() + " " + patientCard.getPatient().getSurname());
        findCardPatient.setExam(patientCard.getExam());
        findCardPatient.setDiagnosis(patientCard.getDiagnosis());
        findCardPatient.setSymptoms(patientCard.getSymptoms());
        findCardPatient.setFunctioning(patientCard.getFunctioning());
        findCardPatient.setActivity(patientCard.getActivity());
        findCardPatient.setRehab(patientCard.getRehab());
        findCardPatient.setDrugs(patientCard.getDrugs());
        findCardPatient.setProcedures(patientCard.getProcedures());
        findCardPatient.setMedicines(patientCard.getMedicines());
        findCardPatient.setDiseases(patientCard.getDiseases());

        return findCardPatient;
    }
    public PatientDTO getPatientDetails(Long id) {
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
    public void delete(Long id) {
        patientRepository.delete(patientRepository.findOne(id));
    }

    public void editPatient(EditPatientDetailsDTO patient) {
        Patient editPatient = patientRepository.findOne(patient.getId());
        PatientDetails editPatientDetails = patientDetailsRepository.findOne(patient.getId());
        editPatient.setName(patient.getName());
        editPatient.setSurname(patient.getSurname());
        editPatientDetails.setAddress(patient.getAddress());
        editPatientDetails.setHouseNumber(patient.getHouseNumber());
        editPatientDetails.setApartmentNumber(patient.getApartmentNumber());
        editPatientDetails.setPhoneNumber(patient.getPhoneNumber());
        editPatientDetails.setEmail(patient.getEmail());

        patientRepository.save(editPatient);
        patientDetailsRepository.save(editPatientDetails);
    }
    public void editPatientCard (EditPatientCardDTO patientCard) {
        PatientCard editPatientCard = patientCardRepository.findOne(patientCard.getId());
        editPatientCard.setDiagnosis(patientCard.getDiagnosis());
        editPatientCard.setSymptoms(patientCard.getSymptoms());
        editPatientCard.setDiseases(patientCard.getDiseases());
        editPatientCard.setFunctioning(patientCard.getFunctioning());
        editPatientCard.setActivity(patientCard.getActivity());
        editPatientCard.setRehab(patientCard.getRehab());
        editPatientCard.setProcedures(patientCard.getProcedures());
        editPatientCard.setMedicines(patientCard.getMedicines());
        editPatientCard.setDrugs(patientCard.getDrugs());

        patientCardRepository.save(editPatientCard);
    }
}