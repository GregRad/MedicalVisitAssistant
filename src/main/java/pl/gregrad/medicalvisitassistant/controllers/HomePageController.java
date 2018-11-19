package pl.gregrad.medicalvisitassistant.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import pl.gregrad.medicalvisitassistant.dtos.Therapist.TherapistDTO;

@Controller
@RequestMapping("/")
public class HomePageController {

    @GetMapping
    public String homePage (@SessionAttribute(value = "loggedUser", required = false) TherapistDTO loggedUser) {
        if(loggedUser == null) {
            return "redirect:/login";
        }
        return "HomePage";
    }
}
