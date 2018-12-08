package pl.gregrad.medicalvisitassistant.controllers.Visit_Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;
import pl.gregrad.medicalvisitassistant.services.Basic.VisitService;

import java.util.List;

@Controller
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    private VisitService visitService;

    @GetMapping("/allVisits")
    public String showAllVisit (Model model) {
        List<VisitDTO> allVisits = visitService.findAllVisit();
        model.addAttribute("visits", allVisits);
        System.out.println(allVisits);
        return "Visit_List";
    }
}
