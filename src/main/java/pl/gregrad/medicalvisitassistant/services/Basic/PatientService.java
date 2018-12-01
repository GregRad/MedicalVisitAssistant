package pl.gregrad.medicalvisitassistant.services.Basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void addPatient (PatientDTO patientForm) {

        String name = patientForm.getName();
        String surname = patientForm.getSurname();
        String address = patientForm.getAddress();
        String houseNumber = patientForm.getHouseNumber();
        String apartmentNumber = patientForm.getApartmentNumber();
        String phoneNumber = patientForm.getPhoneNumber();
        String email = patientForm.getEmail();
        String exam = patientForm.getExam();
        String diagnosis = patientForm.getDiagnosis() ;
        String symptoms = patientForm.getSymptoms();
        String diseases = patientForm.getDiseases();
        String rehab = patientForm.getRehab();
        String functioning = patientForm.getFunctioning();
        String medicines = patientForm.getProcedures();
        String procedures = patientForm.getMedicines();
        String drugs = patientForm.getDrugs();

        Patient newPatient = new Patient();
        newPatient.setName(name);
        newPatient.setSurname(surname);
        newPatient.setAddress(address);
        newPatient.setHouseNumber(houseNumber);
        newPatient.setApartmentNumber(apartmentNumber);
        newPatient.setPhoneNumber(phoneNumber);
        newPatient.setEmail(email);
        newPatient.setExam(exam);
        newPatient.setDiagnosis(diagnosis);
        newPatient.setSymptoms(symptoms);
        newPatient.setDiseases(diseases);
        newPatient.setRehab(rehab);
        newPatient.setFunctioning(functioning);
        newPatient.setProcedures(medicines);
        newPatient.setMedicines(procedures);
        newPatient.setDrugs(drugs);

        patientRepository.save(newPatient);

    }

    public List<Patient> findAllPatients() { List<Patient> allPatients = patientRepository.findAll();return allPatients; }

    public Patient findById(Long id) {
        return patientRepository.findById(id);
    }

    public void delete(Long id) {
        patientRepository.delete(patientRepository.findById(id));
    }

    public void edit(Patient patient) {
        patientRepository.save(patient);
    }
}
