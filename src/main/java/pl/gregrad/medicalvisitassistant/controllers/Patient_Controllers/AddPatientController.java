package pl.gregrad.medicalvisitassistant.controllers.Patient_Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.AddPatientService;

@Controller
@RequestMapping("/patients")
public class AddPatientController {

    @Autowired
    private AddPatientService addPatientService;

    @GetMapping("/addPatient")
    public String showAddPatientForm (Model model) {
        model.addAttribute("patientForm", new PatientDTO());
        return "Add_Patient_Form";
    }
    @PostMapping("/addPatient")
    public String addPatient(@ModelAttribute PatientDTO form) {
        addPatientService.addPatient(form);
        return "Home_Page";
    }
}