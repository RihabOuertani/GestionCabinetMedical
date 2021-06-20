package com.pfa.gestion.dao.entity;



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
public class Consultation {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private int nbrVisite;
    private String description;



    @OneToOne
    @JsonIgnoreProperties({"consultation","hibernateLazyInitializer","handler"})
    private RDV rdv;

    @OneToOne
    private Ordonnance ordonnance;

    @OneToOne
    private Facture facture;
}
