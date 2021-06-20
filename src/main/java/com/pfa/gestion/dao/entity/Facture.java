package com.pfa.gestion.dao.entity;

import java.math.BigDecimal;
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
public class Facture {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private Date date;
    private BigDecimal total;


    @OneToOne(mappedBy = "facture")
    private Consultation consultation;
}
