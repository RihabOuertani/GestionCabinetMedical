package com.pfa.gestion.dto;

import java.util.List;


import com.pfa.gestion.dao.entity.Compte;
import com.pfa.gestion.dao.entity.RDV;
import com.pfa.gestion.dao.entity.Secretaire;


import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class SecretaireDto extends PersonneDto{

    //@JsonIgnore
    private List<RDV> rdvs ;

    //@JsonIgnore
    private Compte commpte;

    public static SecretaireDto fromEntity(Secretaire secretaire) {
        if(secretaire == null) {

            //to do throw an exception

        }

        return SecretaireDto.builder()
                .build();
    }
}
