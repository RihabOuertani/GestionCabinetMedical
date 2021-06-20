package com.pfa.gestion.dto;

import java.util.List;


import com.pfa.gestion.dao.entity.Compte;
import com.pfa.gestion.dao.entity.Medecin;
import com.pfa.gestion.dao.entity.RDV;
import com.pfa.gestion.dao.entity.Specialite;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class MedecinDto extends PersonneDto {


    //@JsonIgnore
    private Specialite specialite;
    //@JsonIgnore
    private List<RDV>rdvs;
    //@JsonIgnore
    private Compte compte;


    public static MedecinDto fromEntity(Medecin medecin) {
        if(medecin == null) {

            //to do throw an exception

        }

        return MedecinDto.builder()
                .build();
    }


}
