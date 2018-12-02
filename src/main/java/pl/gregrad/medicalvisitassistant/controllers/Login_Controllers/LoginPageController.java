package pl.gregrad.medicalvisitassistant.controllers.Login_Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Login.LoginFormDTO;
import pl.gregrad.medicalvisitassistant.dtos.Login.TherapistDTO;
import pl.gregrad.medicalvisitassistant.services.Login_Service.LoginService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginPageController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public String loginPage(@SessionAttribute(value = "loggedUser", required = false) TherapistDTO loggedUser) {
        if (loggedUser != null) {
            return "redirect:/";
        }
        return "Login_Page";
    }

    @PostMapping
    public String processLogin(@SessionAttribute(value = "loggedUser", required = false) TherapistDTO loggedUser,
                               @ModelAttribute("loginForm") @Valid LoginFormDTO form, BindingResult result,
                               HttpSession session) {
        if (loggedUser != null) {
            return "redirect:/";
        }
        if (result.hasErrors()) {
            return "Login_Page";
        }
        boolean validCredentials = loginService.validate(form.getLogin(), form.getPassword());
        if (!validCredentials) {
            result.rejectValue("login", "errors.invalid", "Login i/lub hasło są niepoprawne");
            return "Login_Page";
        }
        TherapistDTO therapist = loginService.login(form.getLogin());
        session.setAttribute("loggedUser", therapist);
        return "Home_Page";
    }
}

