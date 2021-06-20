package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.gestion.dto.SecretaireDto;

public class SecretaireValidator {
    public static List<String> validate(SecretaireDto secretaireDto){
        List<String> errors = new ArrayList<String>();

        if(secretaireDto == null) {
            errors.add("veuillez renseigner les champs du secrertaire");
        }

        if(!StringUtils.hasLength(secretaireDto.getNom())) {
            errors.add("veuillez renseigner le nom");
        }
        if(!StringUtils.hasLength(secretaireDto.getPrenom())) {
            errors.add("veuillez renseigner le prenom ");
        }
        if(!StringUtils.hasLength(secretaireDto.getCin())) {
            errors.add("veuillez renseigner le cin ");
        }
        if(!StringUtils.hasLength(secretaireDto.getTel())) {
            errors.add("veuillez renseigner le num de Tel");
        }
        if(!StringUtils.hasLength(secretaireDto.getCin())) {
            errors.add("veuillez renseigner le CIN");
        }
        return errors;
    }

}
