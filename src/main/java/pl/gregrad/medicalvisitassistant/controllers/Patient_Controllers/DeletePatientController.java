package pl.gregrad.medicalvisitassistant.controllers.Patient_Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;


@Controller
@RequestMapping(("/patients"))
public class DeletePatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.delete(id);
        return "redirect:/patients/allPatients";
    }
}
