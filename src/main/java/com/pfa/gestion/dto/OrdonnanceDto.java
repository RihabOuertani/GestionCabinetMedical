package com.pfa.gestion.dto;

import java.util.Date;


import com.pfa.gestion.dao.entity.Consultation;

import com.pfa.gestion.dao.entity.Ordonnance;

import lombok.Builder;
import lombok.Data;


@Data
@Builder

public class OrdonnanceDto {

    private Long id;

    private Date date;

    private String description;


    //@JsonIgnore
    private Consultation consultation;

    public static OrdonnanceDto fromEntity(Ordonnance ordonnance) {
        if(ordonnance == null) {

            //to do throw an exception

        }

        return OrdonnanceDto.builder()
                .id(ordonnance.getId())
                .date(ordonnance.getDate())
                .description(ordonnance.getDescription())

                .build();
    }

    public static Ordonnance toEntity(OrdonnanceDto ordonnanceDto) {
        if(ordonnanceDto == null) {

            //to do throw an exception

        }

        Ordonnance ordonnance = new Ordonnance();
        ordonnance.setId(ordonnanceDto.getId());
        ordonnance.setDate(ordonnanceDto.getDate());
        ordonnance.setDescription(ordonnanceDto.getDescription());



        return ordonnance;
    }

}
