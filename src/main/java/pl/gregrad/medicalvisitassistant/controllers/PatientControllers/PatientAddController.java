package pl.gregrad.medicalvisitassistant.controllers.PatientControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.PatientAddDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Patient;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;

import java.util.List;

/*
    Zacząłeś od kontrolera do dodawania pacjenta, ale wyszedł Ci z tego kontroler do wszystkiego.
    Zmień nazwę na PatientController jeżeli chcesz zostać w tym modelu encja-kontroler lub rozbij
    to na osobne kontrolery pod usługi.
 */
@Controller
@RequestMapping("/patients")
public class PatientAddController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/addPatient")
    public String showAddPatientForm (Model model) {
        model.addAttribute("patientForm", new PatientAddDTO());
        return "AddPatientForm";
    }

    /*
        Dorób w tym kontrolerze obsługę walidacji.
        Warto też sprawdzić czy przypadkiem ktoś nie dodaje drugi raz takiego samego pacjenta.
        Zastanów się, które dane powinny być unikalne w bazie danych i ten przypadek obsłuż dedykowaną
        usługą z serwisu.
     */
    @PostMapping("/addPatient")
    public String addPatient(@ModelAttribute PatientAddDTO form) {
        patientService.addPatient(form);
        return "HomePage";
    }

    @GetMapping("/allPatients")
    public String showPatients(Model model) {
        /*
            DTOs! Albo wszędzie w aplikacji encje i DTOs wywalamy :)
         */
        List<Patient> allPatients = patientService.findAllPatients();
        model.addAttribute("patients", allPatients );
        return "PatientList";
    }

    @GetMapping("/card/{id}")
    public String showPatientsCard(@PathVariable Long id, Model model) {
        Patient patient = patientService.findById(id);
        model.addAttribute("patients", patient);
        return "PatientCard";
    }

    @GetMapping("/edit/{id}")
    public String patientToEdit(@PathVariable Long id, Model model) {
        model.addAttribute("editForm", patientService.findById(id));
        return "EditPatient";
    }

    /*
        Proponuję Ci stworzyć dedykowane DTO do edycji pacjenta/karty
        w którym możesz określić, które pola są do edycji, a które nie
        i wprowadzić walidację pod kątem edycji.
     */
    @PostMapping("/edit/{id}")
    public String editPatient(@ModelAttribute Patient patient){
        patientService.edit(patient);
        return "redirect:/patients/allPatients";
    }

    /*
        Zrób jakąś stronę pośrednią dla potwierdzenia usunięcia pacjenta.
        Nie opieraj tego na prostym linku typu GET, bo tutaj nieomyślne kliknięcie
        w taki link i dane poszły w świat...
     */
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientService.delete(id);
        return "redirect:/patients/allPatients";
    }
}
