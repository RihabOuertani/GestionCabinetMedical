package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.gestion.dto.OrdonnanceDto;

public class OrdonnanceValidator {

    public static List<String> validate(OrdonnanceDto ordonnanceDto){
        List<String> errors = new ArrayList<String>();

        if(ordonnanceDto == null) {
            errors.add("veuillez renseigner les champs de l'ordonnance");
        }

        if(!StringUtils.hasLength(ordonnanceDto.getDescription())) {
            errors.add("veuillez renseigner la description");
        }

        return errors;
    }
}
