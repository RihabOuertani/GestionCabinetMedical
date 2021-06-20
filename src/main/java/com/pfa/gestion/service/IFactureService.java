package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Facture;

@Service
public interface IFactureService {

    List<Facture> getAllFactures();

    Facture add(Facture facture);

    boolean update(Facture facture);
    boolean deleteById(Long id);
    Facture findById(Long id);
}
