package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Medecin;



public interface IMedecinDao {

    List<Medecin> getAllMedecins();

    Medecin addMedecin(Medecin medecin);

    boolean UpdateMedecin(Medecin medecin);

    boolean deleteMedecin(Long id);

    Optional<Medecin> findById(Long id);
}
