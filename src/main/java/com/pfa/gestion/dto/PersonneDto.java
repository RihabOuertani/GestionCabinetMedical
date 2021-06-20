package com.pfa.gestion.dto;

import javax.persistence.MappedSuperclass;


import lombok.Data;


@Data
@MappedSuperclass
public class PersonneDto {

    private Long id;

    private String nom ;

    private String prenom;

    private String tel ;

    private String cin ;




}
