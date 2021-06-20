package com.pfa.gestion.dto;

import java.util.List;



import com.pfa.gestion.dao.entity.Medecin;

import com.pfa.gestion.dao.entity.Specialite;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class SpecialiteDto {


    private Long id;

    private String nom_Spec;

    //@JsonIgnore
    private List<Medecin> medecins;

    public static SpecialiteDto fromEntity(Specialite specialite) {
        if(specialite== null) {

            //to do throw an exception

        }

        return SpecialiteDto.builder()
                .id(specialite.getId())
                .nom_Spec(specialite.getNom_Spec())

                .build();
    }
    public static Specialite toEntity(SpecialiteDto specialiteDto) {
        if(specialiteDto == null) {

            //to do throw an exception

        }

        Specialite specialite = new Specialite();
        specialite.setId(specialiteDto.getId());
        specialite.setNom_Spec(specialiteDto.getNom_Spec());



        return specialite;
    }


}
