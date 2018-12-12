package pl.gregrad.medicalvisitassistant.controllers.Patient_Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.EditPatientCardDTO;
import pl.gregrad.medicalvisitassistant.dtos.Basic.EditPatientDetailsDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;

import javax.validation.Valid;

@Controller
@RequestMapping(("/patients"))
public class EditPatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/edit/{id}")
    public String patientToEdit(@PathVariable Long id, Model model) {
        model.addAttribute("editForm", patientService.findPatientById(id));
        return "Edit_Patient";
    }
    @GetMapping("/edit-card/{id}")
    public String patientCardToEdit(@PathVariable Long id, Model model) {
        model.addAttribute("editCardForm", patientService.findPatientCardById(id));
        return "Edit_Patient_Card";
    }


    @PostMapping("/edit/{id}")
    public String editPatient(@ModelAttribute ("editForm") @Valid EditPatientDetailsDTO patient,
                              BindingResult result){
        if (result.hasErrors()) {
            return "Edit_Patient";
        }
        patientService.editPatient(patient);
        return "redirect:/patients/allPatients";
    }
    @PostMapping("/edit-card/{id}")
    public String editPatientCard(@ModelAttribute ("editCardForm") @Valid EditPatientCardDTO patient,
                                  BindingResult result){
        if (result.hasErrors()) {
            return "Edit_Patient_Card";
        }
        patientService.editPatientCard(patient);
        return "redirect:/patients/allPatients";
    }
}
