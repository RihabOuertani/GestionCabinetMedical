package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.gestion.dto.DossierDto;

public class DossierValidator {

    public static List<String> validate(DossierDto dossierDto){
        List<String> errors = new ArrayList<String>();

        if(dossierDto == null) {
            errors.add("veuillez renseigner les champs du dossier");
        }



        if(!StringUtils.hasLength(dossierDto.getDescription())) {
            errors.add("veuillez renseigner la description");
        }
        if(!StringUtils.hasLength(dossierDto.getInfoMedic())) {
            errors.add("veuillez renseigner les info medicales");
        }
        return errors;
    }

}
