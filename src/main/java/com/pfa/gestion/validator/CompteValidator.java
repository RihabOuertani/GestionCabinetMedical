package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.gestion.dto.CompteDto;



class CompteValidator {

    public static List<String> validate(CompteDto compteDto){
        List<String> errors = new ArrayList<String>();

        if(compteDto == null) {
            errors.add("veuillez renseigner les champs du compte");
        }

        if(!StringUtils.hasLength(compteDto.getUserName())) {
            errors.add("veuillez renseigner le user name");
        }
        if(!StringUtils.hasLength(compteDto.getPassword())) {
            errors.add("veuillez renseigner le mot de passe");
        }
        return errors;
    }

}
