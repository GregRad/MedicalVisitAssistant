package pl.gregrad.medicalvisitassistant.services.Basic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientDetails;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> findAllPatients() {
        List<Patient> allPatients = patientRepository.findAll();
    return allPatients;
    }

    public Patient findById(Long id) {
        return patientRepository.findOne(id);
    }
    public void delete(Long id) {
        patientRepository.delete(patientRepository.findOne(id));
    }
    public void edit(Patient patient) {
        patientRepository.save(patient);
    }
}
