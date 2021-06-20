package com.pfa.gestion.dto;

import java.math.BigDecimal;
import java.util.Date;


import com.pfa.gestion.dao.entity.Consultation;
import com.pfa.gestion.dao.entity.Facture;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class FactureDto {

    private Long id;

    private Date date;

    private BigDecimal total;

    //@JsonIgnore

    private Consultation consultation;

    public static FactureDto fromEntity(Facture facture) {
        if(facture == null) {

            //to do throw an exception

        }

        return FactureDto.builder()
                .id(facture.getId())
                .date(facture.getDate())
                .total(facture.getTotal())
                .build();
    }

    public static Facture toEntity(FactureDto factureDto) {
        if(factureDto == null) {

            //to do throw an exception

        }

        Facture facture = new Facture();
        facture.setId(factureDto.getId());
        facture.setDate(factureDto.getDate());
        facture.setTotal(factureDto.getTotal());


        return facture;
    }
}
