package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.IPersonneDao;
import com.pfa.gestion.dao.entity.Personne;
import com.pfa.gestion.service.IPersonneService;
@Service
public class PersonneServiceImpl implements IPersonneService {

    @Autowired
    private IPersonneDao personneDao;

    @Override
    public List<Personne> getAllPersonnes() {
        return personneDao.getAllPersonnes();
    }

    @Override
    public Personne add(Personne personne) {
        return personneDao.addPersonne(personne);
    }

    @Override
    public boolean update(Personne personne) {
        return personneDao.updatePersonne(personne);
    }

    @Override
    public boolean deleteById(Long id) {
        return personneDao.deletePersonne(id);
    }

    @Override
    public Personne finById(Long id) {
        Optional<Personne> personneOptional = personneDao.finById(id);
        return personneOptional.orElseThrow(() -> new EntityNotFoundException("rihab&milia not found"));
    }

}
