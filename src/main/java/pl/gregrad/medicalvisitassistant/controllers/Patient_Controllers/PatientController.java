package pl.gregrad.medicalvisitassistant.controllers.Patient_Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientDTO;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;
import pl.gregrad.medicalvisitassistant.services.Basic.VisitService;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private VisitService visitService;

    @GetMapping("/allPatients")
    public String showPatients(Model model) {
        List<PatientDTO> allPatients = patientService.findAllPatients();
        model.addAttribute("patients", allPatients );
        System.out.println(allPatients);
        return "Patient_List";
    }
    @GetMapping("/card/{id}")
    public String showPatientsCard(@PathVariable Long id, Model model) {
        PatientDTO patientCard = patientService.findPatientCardById(id);
        PatientDTO patient = patientService.getPatientDetails(id);
        List<VisitDTO> visits = visitService.findByPatientId(id);
        model.addAttribute("patientsCard", patientCard);
        model.addAttribute("patients", patient);
        model.addAttribute("visits", visits);
        return "Patient_Card";
    }
}
