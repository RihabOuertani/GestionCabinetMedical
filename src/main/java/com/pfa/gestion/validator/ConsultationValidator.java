package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.gestion.dto.ConsultationDto;

public class ConsultationValidator {

    public static List<String> validate(ConsultationDto consultationDto){
        List<String> errors = new ArrayList<String>();

        if(consultationDto == null) {
            errors.add("veuillez renseigner les champs du consultation");
        }

        // a voir

        if(!StringUtils.hasLength(String.valueOf(consultationDto.getNbrVisite()))) {
            errors.add("veuillez renseigner le user name");
        }
        if(!StringUtils.hasLength(consultationDto.getDescription())) {
            errors.add("veuillez renseigner le mot de passe");
        }
        return errors;
    }
}
