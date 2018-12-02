package pl.gregrad.medicalvisitassistant.services.Login_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
<<<<<<< HEAD
import pl.gregrad.medicalvisitassistant.dtos.Basic.TherapistDTO;
=======
import pl.gregrad.medicalvisitassistant.dtos.Login.TherapistDTO;
>>>>>>> 718229d91fa0c7189b116e7f54391e50fcd53bfb
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
