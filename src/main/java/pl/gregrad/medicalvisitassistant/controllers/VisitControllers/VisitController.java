package pl.gregrad.medicalvisitassistant.controllers.VisitControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.gregrad.medicalvisitassistant.dtos.Basic.VisitDTO;
import pl.gregrad.medicalvisitassistant.entity.Basic.Visit;
import pl.gregrad.medicalvisitassistant.services.Basic.PatientService;
import pl.gregrad.medicalvisitassistant.services.Basic.VisitService;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    private VisitService visitService;

    @Autowired
    private PatientService patientService;

    @GetMapping("/addVisit/{patientId:[0-9]+}")
    public String showAddVisitForm (@PathVariable Long patientId, Model model) {
        VisitDTO newVisit = new VisitDTO();
        newVisit.setPatientId(patientId);
        model.addAttribute("visitForm", newVisit);
        return "AddVisitForm";
    }



    @GetMapping("/patientVisit/{patientId:[0-9]+}")
    public String showPatientVisits (@PathVariable Long patientId, Model model) {
        List<Visit> visits = visitService.findByPatientId(patientId);
        model.addAttribute("patientVisits", visits);
        return "PatientVisits";
    }


    @PostMapping("/addVisit")
    public String addVisit (@ModelAttribute VisitDTO form, @RequestParam String visitDateRaw) {
        form.setVisitDate(LocalDateTime.parse(visitDateRaw));
        visitService.addVisit(form);
        return "HomePage";
    }
    @GetMapping("/allVisits")
    public String showAllVisit (Model model) {
        List<Visit> allVisits = visitService.findAllVisit();
        model.addAttribute("visits", allVisits);
        return "VisitList";
    }
    @GetMapping("/edit/{id}")
    public String visitToEdit (@PathVariable Long id, Model model) {
        VisitDTO editVisit = visitService.findById(id);
        model.addAttribute("editVisitForm", editVisit);
        return "EditVisit";
    }
    @PostMapping("/edit/{id}")
    public String editVisit (@ModelAttribute("editVisitForm") VisitDTO visit, @RequestParam(required = false) String visitDateRaw) {
        visit.setVisitDate(LocalDateTime.parse(visitDateRaw));
        visitService.edit(visit);
        return "redirect:/visit/allVisits";
    }
    @GetMapping("/delete/{id}")
    public String deleteVisit (@PathVariable Long id) {
        visitService.delete(id);
        return "redirect:/visit/allVisits";
    }
}
