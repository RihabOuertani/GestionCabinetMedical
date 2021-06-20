package com.pfa.gestion.dao.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Secretaire extends Personne {

    @OneToMany(mappedBy = "secretaire")
    private List<RDV> rdvs ;

    @OneToOne
    private Compte commpte;




}
