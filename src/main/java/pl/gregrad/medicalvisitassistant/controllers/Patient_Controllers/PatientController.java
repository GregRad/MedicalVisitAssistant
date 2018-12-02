package pl.gregrad.medicalvisitassistant.controllers.Patient_Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/allPatients")
    public String showPatients(Model model) {
        List<PatientDTO> allPatients = patientService.findAllPatients();
        model.addAttribute("patients", allPatients );
        return "Patient_List";
    }
    @GetMapping("/details/{id}")
    public String showPatientsDetails(@PathVariable Long id, Model model) {
        PatientDTO patient = patientService.getPatientDetails(id);
        model.addAttribute("patients", patient);
        return "Patient_Details";
    }
    @GetMapping("/card/{id}")
    public String showPatientsCard(@PathVariable Long id, Model model) {
        PatientDTO patient = patientService.getPatientCard(id);
        model.addAttribute("patients", patient);
        return "Patient_Card";
    }
}
