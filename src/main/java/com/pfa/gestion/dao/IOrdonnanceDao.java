package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Ordonnance;

public interface IOrdonnanceDao {

    List<Ordonnance> getAllOrdonnances();

    Ordonnance addOrdonnance(Ordonnance ordonnance);
    boolean updateOrdonnance(Ordonnance ordonnance);
    boolean deleteOrdonnance(Long id);
    Optional<Ordonnance> findById(Long id);


}
