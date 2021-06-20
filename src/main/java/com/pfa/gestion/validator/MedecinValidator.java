package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;
import com.pfa.gestion.dto.MedecinDto;

public class MedecinValidator {

    public static List<String> validate(MedecinDto medecinDto){
        List<String> errors = new ArrayList<String>();

        if(medecinDto == null) {
            errors.add("veuillez renseigner les champs du compte");
        }

        if(!StringUtils.hasLength(medecinDto.getNom())) {
            errors.add("veuillez renseigner le nom");
        }
        if(!StringUtils.hasLength(medecinDto.getPrenom())) {
            errors.add("veuillez renseigner le prenom ");
        }
        if(!StringUtils.hasLength(medecinDto.getCin())) {
            errors.add("veuillez renseigner le cin ");
        }
        if(!StringUtils.hasLength(medecinDto.getTel())) {
            errors.add("veuillez renseigner le num de Tel");
        }

        return errors;
    }

}
