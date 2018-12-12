package pl.gregrad.medicalvisitassistant.controllers.Visit_Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.AddVisitService;

import javax.validation.Valid;

@Controller
@RequestMapping("/visit")
public class AddVisitController {

    @Autowired
    private AddVisitService addVisitService;

    @GetMapping("/addVisit/{patientId:[0-9]+}")
    public String showAddVisitForm (@PathVariable Long patientId, Model model) {
        VisitDTO newVisit = new VisitDTO();
        newVisit.setPatientId(patientId);
        model.addAttribute("visitForm", newVisit);
        return "Add_Visit_Form";
    }
    @PostMapping("/addVisit")
    public String addVisit (@ModelAttribute ("visitForm") @Valid VisitDTO form,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "Add_Visit_Form";
        }
        addVisitService.addVisit(form);
        return "redirect:/visit/allVisits";
    }
}
