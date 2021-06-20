package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.IPersonneDao;
import com.pfa.gestion.dao.entity.Personne;
import com.pfa.gestion.dao.repository.PersonneRepository;


@Repository
public class PersonneDaoImpl implements IPersonneDao {


    @Autowired
    private PersonneRepository personneRepository;

    @Override
    public List<Personne> getAllPersonnes() {
        return personneRepository.findAll();
    }

    @Override
    public Personne addPersonne(Personne personne) {

        return personneRepository.save(personne);
    }

    @Override
    public boolean updatePersonne(Personne personne) {
        if (personneRepository.save(personne)!= null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deletePersonne(Long id) {
        if (personneRepository.existsById(id)) {
            personneRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Personne> finById(Long id) {
        return personneRepository.findById(id);
    }

}
