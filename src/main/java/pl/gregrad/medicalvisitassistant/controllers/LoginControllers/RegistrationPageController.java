package pl.gregrad.medicalvisitassistant.controllers.LoginControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.medicalvisitassistant.dtos.Login.RegistrationFormDTO;
import pl.gregrad.medicalvisitassistant.services.LoginServices.RegistrationService;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationPageController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public String showRegistrationPage(Model model) {
        model.addAttribute("regForm", new RegistrationFormDTO());
        return "registration";
    }

    @PostMapping
    public String processRegistrationForm(@ModelAttribute("regForm") @Valid RegistrationFormDTO form,
                                          BindingResult results, Model model) {
        if (results.hasErrors()) {
            return "registration";
        }
        if (!form.getConfirmedPassword().equals(form.getPassword())) {
            results.rejectValue("password","errors.notmatch","Hasło i powtórzone hasło muszą być zgodne");
            return "registration";
        }
        try {
            registrationService.register(form);
            return "redirect:/";
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
            results.rejectValue("login", "errors.nonunique", "Login/email są już zajęte");
            return "registration";
        } catch (RuntimeException re) {
            re.printStackTrace();
            model.addAttribute("error", true);
            return "registration";
        }
    }
}

