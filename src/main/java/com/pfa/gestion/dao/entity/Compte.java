package com.pfa.gestion.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@NoArgsConstructor
@Entity
@Builder
public class Compte {

    @Id
    @Column(length = 100)
    private String userName;

    private String password;

    @OneToOne(mappedBy = "compte")
    private Medecin medecin;

    @OneToOne(mappedBy = "commpte")
    private Secretaire secretaire;
}
