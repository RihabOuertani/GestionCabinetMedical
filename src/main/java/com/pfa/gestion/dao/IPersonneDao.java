package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Personne;

public interface IPersonneDao {

    List<Personne> getAllPersonnes();

    Personne addPersonne(Personne personne);

    boolean updatePersonne(Personne personne);

    boolean deletePersonne(Long id);

    Optional<Personne> finById(Long id);


}
