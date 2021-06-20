package com.pfa.gestion.dto;


import com.pfa.gestion.dao.entity.Compte;
import com.pfa.gestion.dao.entity.Medecin;
import com.pfa.gestion.dao.entity.Secretaire;

import lombok.Builder;
import lombok.Data;

@Data
@Builder


public class CompteDto {


    private String userName;

    private String password;


    //@JsonIgnore
    private Medecin medecin;

    //@JsonIgnore
    private Secretaire secretaire;



    public static CompteDto fromEntity(Compte compte) {
        if(compte == null) {

            //to do throw an exception

        }

        return CompteDto.builder()
                .userName(compte.getUserName())
                .password(compte.getPassword())
                .build();
    }

    public static Compte toEntity(CompteDto compteDto) {
        if(compteDto == null) {

            //to do throw an exception

        }

        Compte compte = new Compte();
        compte.setUserName(compteDto.getUserName());
        compte.setPassword(compteDto.getPassword());



        return compte;
    }
}









