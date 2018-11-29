package pl.gregrad.medicalvisitassistant.controllers.LoginControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import pl.gregrad.medicalvisitassistant.dtos.Basic.TherapistDTO;

@Controller
@RequestMapping("/")
public class HomePageController {

    @GetMapping
    public String homePage (@SessionAttribute(value = "loggedUser", required = false) TherapistDTO loggedUser) {
        if(loggedUser == null) {
            return "redirect:/login";
        }
        /*
            W nazwach plików/ścieżek raczej unika CamelCase. Stosuj dolne podkreślenia albo myślniki na zasadzie `home-page`
            albo `home_page`.
         */
        return "HomePage";
    }
}
