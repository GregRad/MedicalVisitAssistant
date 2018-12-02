package pl.gregrad.medicalvisitassistant.controllers.Visit_Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.VisitService;


@Controller
@RequestMapping("/visit")
public class EditVisitController {

    @Autowired
    private VisitService visitService;

    @GetMapping("/edit/{id}")
    public String visitToEdit (@PathVariable Long id, Model model) {
        VisitDTO editVisit = visitService.findById(id);
        model.addAttribute("editVisitForm", editVisit);
        return "Edit_Visit";
    }
    @PostMapping("/edit/{id}")
    public String editVisit (@ModelAttribute("editVisitForm") VisitDTO visit) {
        visitService.edit(visit);
        return "redirect:/visit/allVisits";
    }
}
