package pl.gregrad.medicalvisitassistant.services.LoginServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.RegistrationFormDTO;
import pl.gregrad.medicalvisitassistant.entity.Therapist.Therapist;
import pl.gregrad.medicalvisitassistant.entity.Therapist.TherapistDetails;
import pl.gregrad.medicalvisitassistant.entity.Therapist.TherapistLogInData;
import pl.gregrad.medicalvisitassistant.entity.Therapist.TherapistRole;
import pl.gregrad.medicalvisitassistant.repositories.Therapist.TherapistDetailsRepository;
import pl.gregrad.medicalvisitassistant.repositories.Therapist.TherapistLoginDataRepository;
import pl.gregrad.medicalvisitassistant.repositories.Therapist.TherapistRepository;
import pl.gregrad.medicalvisitassistant.repositories.Therapist.TherapistRoleRepository;

@Service
public class RegistrationService {
    @Autowired
    private TherapistLoginDataRepository therapistLoginDataRepository;

    @Autowired
    private TherapistRepository therapistRepository;

    @Autowired
    private TherapistDetailsRepository therapistDetailsRepository;

    @Autowired
    private TherapistRoleRepository therapistRoleRepository;

    public void register(RegistrationFormDTO form) {
        String login = form.getLogin();
        String email = form.getEmail();
        String password = form.getPassword();

        Boolean loginUsed = therapistRepository.isLoginUsed(login);
        if (loginUsed != null && loginUsed) {
            throw new IllegalArgumentException("Login zajęty");
        }
        Boolean emailUsed = therapistRepository.isEmailUsed(email);
        if (emailUsed != null && emailUsed) {
            throw new IllegalArgumentException("Email zajęty");
        }
        Therapist therapist = new Therapist();
        therapist.setLogin(login);
        therapist.setEmail(email);
        therapistRepository.save(therapist);

        TherapistDetails details = new TherapistDetails();
        details.setFirstName(form.getFirstName());
        details.setLastName(form.getLastName());
        details.setUser(therapist);
        therapistDetailsRepository.save(details);

        TherapistLogInData loginData = new TherapistLogInData();
        loginData.setTherapist(therapist);
        loginData.setPassword(password);
        therapistLoginDataRepository.save(loginData);

        TherapistRole role = new TherapistRole();
        role.setTherapist(therapist);
        role.setRole("USER");
        therapistRoleRepository.save(role);
    }
}
