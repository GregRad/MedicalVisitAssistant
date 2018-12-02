package pl.gregrad.medicalvisitassistant.controllers.Patient_Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;

@Controller
@RequestMapping(("/patients"))
public class EditPatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/edit/{id}")
    public String patientToEdit(@PathVariable Long id, Model model) {
        model.addAttribute("editForm", patientService.findById(id));
        return "Edit_Patient";
    }
    @PostMapping("/edit-patient/{id}")
    public String editPatient(@ModelAttribute PatientDTO patient){
        patientService.editPatient(patient);
        return "redirect:/patients/allPatients";
    }
    @PostMapping("/edit-patient-details/{id}")
    public String editPatientDetails(@ModelAttribute PatientDTO patient){
        patientService.editPatientDetails(patient);
        return "redirect:/patients/allPatients";
    }
    @PostMapping("/edit-patient-card/{id}")
    public String editPatientCard(@ModelAttribute PatientDTO patient){
        patientService.editPatientCard(patient);
        return "redirect:/patients/allPatients";
    }
}
