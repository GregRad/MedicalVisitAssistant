package pl.gregrad.medicalvisitassistant.services.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.repositories.Basic.PatientExamRepository;

@Service
public class PatientExamService {

    @Autowired
    private PatientExamRepository patientExamRepository;


}
