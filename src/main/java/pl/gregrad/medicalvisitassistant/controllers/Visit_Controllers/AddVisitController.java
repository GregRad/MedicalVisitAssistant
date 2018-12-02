package pl.gregrad.medicalvisitassistant.controllers.Visit_Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.VisitService;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/visit")
public class AddVisitController {

    @Autowired
    private VisitService visitService;

    @GetMapping("/addVisit/{patientId:[0-9]+}")
    public String showAddVisitForm (@PathVariable Long patientId, Model model) {
        VisitDTO newVisit = new VisitDTO();
        newVisit.setPatientId(patientId);
        model.addAttribute("visitForm", newVisit);
        return "Add_Visit_Form";
    }
    @PostMapping("/addVisit")
    public String addVisit (@ModelAttribute VisitDTO form, @RequestParam String visitDateRaw) {
        form.setVisitDate(LocalDateTime.parse(visitDateRaw));
        visitService.addVisit(form);
        return "Visit_List";
    }
}
