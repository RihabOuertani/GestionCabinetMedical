package com.pfa.gestion.validator;

import java.util.ArrayList;
import java.util.List;
import com.pfa.gestion.dto.FactureDto;

public class FactureValidator {

    public static List<String> validate(FactureDto factureDto){
        List<String> errors = new ArrayList<String>();

        if(factureDto == null) {
            errors.add("veuillez renseigner les champs du dossier");
        }

        // date !!

        if(factureDto.getTotal() == null) {
            errors.add("veuillez renseigner la valeur de facture");
        }

        return errors;
    }

}
