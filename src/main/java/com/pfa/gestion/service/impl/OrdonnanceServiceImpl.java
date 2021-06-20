package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.IOrdonnanceDao;
import com.pfa.gestion.dao.entity.Ordonnance;
import com.pfa.gestion.service.IOrdonnanceService;

@Service
public class OrdonnanceServiceImpl implements IOrdonnanceService {

    @Autowired
    private IOrdonnanceDao ordonnanceDao;

    @Override
    public List<Ordonnance> getAllOrdonnances() {
        return ordonnanceDao.getAllOrdonnances();
    }

    @Override
    public Ordonnance add(Ordonnance ordonnance) {
        return ordonnanceDao.addOrdonnance(ordonnance);
    }

    @Override
    public boolean update(Ordonnance ordonnance) {
        return ordonnanceDao.updateOrdonnance(ordonnance);
    }

    @Override
    public boolean deleteById(Long id) {
        return ordonnanceDao.deleteOrdonnance(id);
    }

    @Override
    public Ordonnance findById(Long id) {
        Optional<Ordonnance> ordonnanceOptional= ordonnanceDao.findById(id);
        return ordonnanceOptional.orElseThrow(()-> new EntityNotFoundException("ordonnance not found" +id));
    }

}
