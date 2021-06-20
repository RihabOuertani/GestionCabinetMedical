package com.pfa.gestion.dao.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor@Entity
public class RDV {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime date;
    private String motif;


    @ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    @JsonIgnoreProperties({"rdv","hibernateLazyInitializer","handler"})
    private Patient patient;

    @ManyToOne
    private Secretaire secretaire;

    @ManyToOne
    private Medecin medecin;

    @OneToOne(mappedBy = "rdv",fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
    @JsonIgnoreProperties({"rdv","hibernateLazyInitializer","handler"})
    private Consultation consultation;


}
