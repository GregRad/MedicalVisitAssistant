package pl.gregrad.medicalvisitassistant.controllers.Registration_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.gregrad.medicalvisitassistant.dtos.Registration.RegistrationFormDTO;
import pl.gregrad.medicalvisitassistant.services.Registration_Service.RegistrationService;

import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationPageController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping
    public String showRegistrationPage(Model model) {
        model.addAttribute("regForm", new RegistrationFormDTO());
        return "Registration_Form";
    }

    @PostMapping
    public String processRegistrationForm(@ModelAttribute("regForm") @Valid RegistrationFormDTO form,
                                          BindingResult results, Model model) {
        if (results.hasErrors()) {
            return "Registration_Form";
        }
        if (!form.getConfirmedPassword().equals(form.getPassword())) {
            results.rejectValue("password","errors.notmatch","Hasło i powtórzone hasło muszą być zgodne");
            return "Registration_Form";
        }
        try {
            registrationService.register(form);
            return "redirect:/";
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
            results.rejectValue("login", "errors.nonunique", "Login/email są już zajęte");
            return "Registration_Form";
        } catch (RuntimeException re) {
            re.printStackTrace();
            model.addAttribute("error", true);
            return "Registration_Form";
        }
    }
}

