package pl.gregrad.medicalvisitassistant.controllers.StatisticsControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.StatisticsService;

import java.util.List;



@Controller
@RequestMapping("/stats")
public class StatisticsController {

    @Autowired
    StatisticsService statisticsService;

    @GetMapping("/details")
    public String showVisitValue(Model model) {

        List<VisitDTO> visitsById = statisticsService.findAll();
        model.addAttribute("visits", visitsById);
        return "Statistics";
    }

}
