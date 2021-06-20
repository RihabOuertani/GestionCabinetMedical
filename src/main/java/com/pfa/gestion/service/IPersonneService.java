package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Personne;
@Service
public interface IPersonneService {

    List<Personne> getAllPersonnes();
    Personne add(Personne personne);
    boolean update(Personne personne);
    boolean deleteById(Long id);
    Personne finById(Long id);
}
