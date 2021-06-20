package com.pfa.gestion.dto;

import java.util.Date;

import com.pfa.gestion.dao.entity.Dossier;
import com.pfa.gestion.dao.entity.Patient;



import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class DossierDto {

    private Long id;

    private Date date;

    private String description;

    private String infoMedic;

    //@JsonIgnore
    private Patient patient;


    public static DossierDto fromEntity(Dossier dossier) {
        if(dossier == null) {

            //to do throw an exception

        }

        return DossierDto.builder()
                .id(dossier.getId())
                .date(dossier.getDate())
                .description(dossier.getDescription())
                .infoMedic(dossier.getInfoMedic())
                .build();
    }

    public static Dossier toEntity(DossierDto dossierDto) {
        if(dossierDto == null) {

            //to do throw an exception

        }

        Dossier dossier = new Dossier();
        dossier.setId(dossierDto.getId());
        dossier.setDate(dossierDto.getDate());
        dossier.setDescription(dossierDto.getDescription());
        dossier.setInfoMedic(dossierDto.getInfoMedic());


        return dossier;
    }
}

