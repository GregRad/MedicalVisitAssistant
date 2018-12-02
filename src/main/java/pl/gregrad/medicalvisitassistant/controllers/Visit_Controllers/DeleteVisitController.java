package pl.gregrad.medicalvisitassistant.controllers.Visit_Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.medicalvisitassistant.services.Basic.VisitService;

@Controller
@RequestMapping("/visit")
public class DeleteVisitController {

    @Autowired
    private VisitService visitService;

    @GetMapping("/delete/{id}")
    public String deleteVisit (@PathVariable Long id) {
        visitService.delete(id);
        return "redirect:/visit/allVisits";
    }
}
