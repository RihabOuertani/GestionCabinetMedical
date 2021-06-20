package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.gestion.dto.SpecialiteDto;

public class SpecialiteValidator {
    public static List<String> validate(SpecialiteDto specialiteDto){
        List<String> errors = new ArrayList<String>();

        if(specialiteDto == null) {
            errors.add("veuillez renseigner les champs du specialites");
        }

        if(!StringUtils.hasLength(specialiteDto.getNom_Spec())) {
            errors.add("veuillez renseigner le nom de specialité");
        }

        return errors;
    }

}
