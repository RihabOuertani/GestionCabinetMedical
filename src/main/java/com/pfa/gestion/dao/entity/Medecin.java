package com.pfa.gestion.dao.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Medecin extends Personne {

    @ManyToOne
    private Specialite specialite;

    @OneToMany(mappedBy = "medecin")
    private List<RDV>rdvs;

    @OneToOne
    private Compte compte;
}
