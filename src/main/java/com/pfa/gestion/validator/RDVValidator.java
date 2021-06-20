package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.gestion.dto.RDVDto;

public class RDVValidator {

    public static List<String> validate(RDVDto rdvDto){
        List<String> errors = new ArrayList<String>();

        if(rdvDto == null) {
            errors.add("veuillez renseigner les champs du Rendez-vous");
        }

        if(!StringUtils.hasLength(rdvDto.getMotif())) {
            errors.add("veuillez renseigner le Motif de rendez-vous");
        }

        return errors;
    }
}
