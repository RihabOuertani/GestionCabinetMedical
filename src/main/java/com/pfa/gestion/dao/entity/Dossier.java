package com.pfa.gestion.dao.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor@Builder
@Entity
public class Dossier {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private Date date;
    private String description;
    private String infoMedic;

    @OneToOne
    private Patient patient;

}
