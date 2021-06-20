package com.pfa.gestion.dao.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Patient extends Personne {

    private Date dateNaiss;

    private String sexe;

    private String etatCivil;

    private String adresse;

    private String assurance;

    private String cnam;

    @OneToOne(mappedBy = "patient")
    private Dossier dossier;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties(    value = { "exchange" , "patient","hibernateLazyInitializer","handler"} , allowSetters = true)
    private List<RDV> rdvs;


}
