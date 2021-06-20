package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.IOrdonnanceDao;
import com.pfa.gestion.dao.entity.Ordonnance;
import com.pfa.gestion.dao.repository.OrdannanceRepository;

@Repository
public class OrdonnanceDaoImpl implements IOrdonnanceDao {

    @Autowired
    private OrdannanceRepository ordonnanceRepository;


    @Override
    public List<Ordonnance> getAllOrdonnances() {
        return ordonnanceRepository.findAll();
    }

    @Override
    public Ordonnance addOrdonnance(Ordonnance ordonnance) {
        return ordonnanceRepository.save(ordonnance);
    }

    @Override
    public boolean updateOrdonnance(Ordonnance ordonnance) {
        if(ordonnanceRepository.save(ordonnance) != null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteOrdonnance(Long id) {
        if(ordonnanceRepository.existsById(id)) {
            ordonnanceRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Ordonnance> findById(Long id) {
        return ordonnanceRepository.findById(id);
    }

}
