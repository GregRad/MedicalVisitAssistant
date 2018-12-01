package pl.gregrad.medicalvisitassistant.controllers.Patient_Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.entity.Basic.PatientDetails;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/allPatients")
    public String showPatients(Model model) {
        List<PatientDetails> allPatients = patientService.findAllPatients();
        model.addAttribute("patients", allPatients );
        return "Patient_List";
    }
    @GetMapping("/card/{id}")
    public String showPatientsCard(@PathVariable Long id, Model model) {
        PatientDetails patient = patientService.findById(id);
        model.addAttribute("patients", patient);
        return "Patient_Card";
    }
    @GetMapping("/edit/{id}")
    public String patientToEdit(@PathVariable Long id, Model model) {
        model.addAttribute("editForm", patientService.findById(id));
        return "Edit_Patient";
    }
    @PostMapping("/edit/{id}")
    public String editPatient(@ModelAttribute PatientDetails patient){
        patientService.edit(patient);
        return "redirect:/patients/allPatients";
    }
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.delete(id);
        return "redirect:/patients/allPatients";
    }
}
