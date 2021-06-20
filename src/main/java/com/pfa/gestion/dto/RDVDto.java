package com.pfa.gestion.dto;

import java.time.LocalDateTime;
import java.util.Date;




import com.pfa.gestion.dao.entity.Consultation;

import com.pfa.gestion.dao.entity.Medecin;
import com.pfa.gestion.dao.entity.Patient;
import com.pfa.gestion.dao.entity.RDV;
import com.pfa.gestion.dao.entity.Secretaire;



import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RDVDto {


    private Long id;

    private LocalDateTime date;

    private String motif;


    //@JsonIgnore
    private Patient patient;

    //@JsonIgnore
    private Secretaire secretaire;

    //@JsonIgnore
    private Medecin medecin;

    //@JsonIgnore
    private Consultation consultation;

    public static RDVDto fromEntity(RDV rdv) {
        if(rdv == null) {

            //to do throw an exception

        }

        return RDVDto.builder()
                .id(rdv.getId())
                .date(rdv.getDate())
                .motif(rdv.getMotif())
                .build();
    }

    public static RDV toEntity(RDVDto rdvDto) {
        if(rdvDto == null) {

            //to do throw an exception

        }

        RDV rdv = new RDV();
        rdv.setId(rdvDto.getId());
        rdv.setDate(rdvDto.getDate());
        rdv.setMotif(rdvDto.getMotif());


        return rdv;
    }

}
