package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Ordonnance;

@Service
public interface IOrdonnanceService {

    List<Ordonnance> getAllOrdonnances();

    Ordonnance add(Ordonnance ordonnance);

    boolean update(Ordonnance ordonnance);

    boolean deleteById(Long id);

    Ordonnance findById(Long id);

}
