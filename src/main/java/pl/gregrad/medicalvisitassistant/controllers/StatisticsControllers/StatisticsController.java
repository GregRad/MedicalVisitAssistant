package pl.gregrad.medicalvisitassistant.controllers.StatisticsControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.services.Basic.StatisticsService;

import java.util.List;



@Controller
@RequestMapping("/stats")
public class StatisticsController {

    @Autowired
    StatisticsService statisticsService;

    @GetMapping("/summary")
    public String showVisitValue(Model model) {
        List<VisitDTO> visitsById = statisticsService.findAll();
        model.addAttribute("visits", visitsById);
        return "Statistics";
    }
    @GetMapping("/month/{visitDate}")
    public String showMonthVisitValue(@PathVariable Integer visitDate, Model model){
        List<VisitDTO> visitByDate = statisticsService.getByVisitDate(visitDate);
        model.addAttribute("month", visitByDate);
        return "Monthly_Statistics";
    }

}
