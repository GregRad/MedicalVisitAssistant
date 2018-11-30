package pl.gregrad.medicalvisitassistant.services.LoginServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.gregrad.medicalvisitassistant.dtos.Basic.TherapistDTO;
import pl.gregrad.medicalvisitassistant.entity.Therapist.Therapist;
import pl.gregrad.medicalvisitassistant.repositories.Therapist.TherapistLoginDataRepository;
import pl.gregrad.medicalvisitassistant.repositories.Therapist.TherapistRepository;

@Service
public class LoginService {
    @Autowired
    private TherapistRepository therapistRepository;

    @Autowired
    private TherapistLoginDataRepository therapistLoginDataRepository;

    public boolean validate(String login, String password) {
        Boolean check = therapistLoginDataRepository.checkCredentials(login, password);
        return check != null ? check : false;
    }

    public TherapistDTO login(String login) {
        Therapist therapist = therapistRepository.findByLogin(login);
        TherapistDTO therapistDTO = new TherapistDTO();
        therapistDTO.setLogin(therapist.getLogin());
        therapistDTO.setId(therapist.getId());
        return therapistDTO;
    }
}
