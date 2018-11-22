package pl.gregrad.medicalvisitassistant.controllers.PatientControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientAddDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientAddController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/addPatient")
    public String showAddPatientForm (Model model) {
        model.addAttribute("patientForm", new PatientAddDTO());
        return "AddPatientForm";
    }
    @PostMapping("/addPatient")
    public String addPatient(@ModelAttribute PatientAddDTO form) {
        patientService.addPatient(form);
        return "HomePage";
    }
    @GetMapping("/allPatients")
    public String showPatients(Model model) {
        List<Patient> allPatients = patientService.findAllPatients();
        model.addAttribute("patients", allPatients );
        return "PatientList";
    }
    @GetMapping("/card/{id}")
    public String showPatientsCard(@PathVariable Long id, Model model) {
        Patient patient = patientService.findById(id);
        model.addAttribute("patients", patient);
        return "PatientCard";
    }
    @GetMapping("/edit/{id}")
    public String patientToEdit(@PathVariable Long id, Model model) {
        model.addAttribute("editForm", patientService.findById(id));
        return "EditPatient";
    }
    @PostMapping("/edit/{id}")
    public String editPatient(@ModelAttribute Patient patient){
        patientService.edit(patient);
        return "redirect:/patients/allPatients";
    }
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.delete(id);
        return "redirect:/patients/allPatients";
    }
}
