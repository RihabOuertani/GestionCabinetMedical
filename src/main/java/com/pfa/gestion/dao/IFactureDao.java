package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Facture;

public interface IFactureDao {

    List<Facture> getAllFactures();

    Facture addFacture(Facture facture);

    boolean updateFacture(Facture facture);

    boolean deleteFacture(Long id);

    Optional<Facture> findById(Long id);

}
