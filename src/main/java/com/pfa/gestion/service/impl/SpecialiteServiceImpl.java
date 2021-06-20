package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.ISpecialiteDao;
import com.pfa.gestion.dao.entity.Specialite;
import com.pfa.gestion.service.ISpecialiteService;

@Service
public class SpecialiteServiceImpl implements ISpecialiteService {

    @Autowired
    private ISpecialiteDao specialiteDao;

    @Override
    public List<Specialite> getAllSpecialites() {
        return specialiteDao.getAllSpecialites();
    }

    @Override
    public Specialite add(Specialite specialite) {
        return specialiteDao.addSpecialite(specialite);
    }

    @Override
    public boolean update(Specialite specialite) {
        return specialiteDao.updateSpecialite(specialite);
    }

    @Override
    public boolean deleteById(Long id) {
        return specialiteDao.deleteSpecialite(id);
    }

    @Override
    public Specialite findById(Long id) {
        Optional<Specialite> specialiteOptional = specialiteDao.findById(id);
        return specialiteOptional.orElseThrow(()-> new EntityNotFoundException("Spécialite not found"+id));
    }

}
