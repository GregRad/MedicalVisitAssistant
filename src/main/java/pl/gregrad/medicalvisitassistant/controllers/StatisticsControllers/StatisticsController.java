package pl.gregrad.medicalvisitassistant.controllers.StatisticsControllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import java.util.List;

@Controller
@RequestMapping("/stats")
public class StatisticsController {

    @GetMapping("/details")
    public String showVisitValue() {
        return "Statistics";
    }

}
