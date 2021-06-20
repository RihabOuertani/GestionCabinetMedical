package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.pfa.gestion.dto.PatientDto;

public class PatientValidator {
    public static List<String> validate(PatientDto patientDto){
        List<String> errors = new ArrayList<String>();

        if(patientDto == null) {
            errors.add("veuillez renseigner les patients");
        }

        if(!StringUtils.hasLength(patientDto.getSexe())) {
            errors.add("veuillez renseigner le sexe du patient");
        }
        if(!StringUtils.hasLength(patientDto.getEtatCivil())) {
            errors.add("veuillez renseigner l'etat civil du patient");
        }
        if(!StringUtils.hasLength(patientDto.getAdresse())) {
            errors.add("veuillez renseigner l'adresse de patient");
        }
        if(!StringUtils.hasLength(patientDto.getAssurance())) {
            errors.add("veuillez renseigner le code assurance");
        }
        if(!StringUtils.hasLength(patientDto.getCnam())) {
            errors.add("veuillez renseigner le code cnam");
        }
        return errors;
    }

}
