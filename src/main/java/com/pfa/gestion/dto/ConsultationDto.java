package com.pfa.gestion.dto;


import com.pfa.gestion.dao.entity.Consultation;

import com.pfa.gestion.dao.entity.Ordonnance;
import com.pfa.gestion.dao.entity.RDV;


import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class ConsultationDto {

    private Long id;

    private int nbrVisite;

    private String description;

    //@JsonIgnore
    private RDV rdv;

    //@JsonIgnore
    private Ordonnance ordonnance;

    //@JsonIgnore
    private Consultation consultation;

    public static ConsultationDto fromEntity(Consultation consultation) {
        if(consultation == null) {

            //to do throw an exception

        }

        return ConsultationDto.builder()
                .id(consultation.getId())
                .nbrVisite(consultation.getNbrVisite())
                .description(consultation.getDescription())
                .build();
    }

    public static Consultation toEntity(ConsultationDto consultationDto) {
        if(consultationDto == null) {

            //to do throw an exception

        }

        Consultation consultation = new Consultation();
        consultation.setId(consultationDto.getId());
        consultation.setNbrVisite(consultationDto.getNbrVisite());



        return consultation;
    }

}
