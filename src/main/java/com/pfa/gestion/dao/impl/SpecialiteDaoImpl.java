package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.ISpecialiteDao;
import com.pfa.gestion.dao.entity.Specialite;
import com.pfa.gestion.dao.repository.SpecialiteRepository;


@Repository
public class SpecialiteDaoImpl implements ISpecialiteDao {

    @Autowired
    private SpecialiteRepository specialiteRepository;

    @Override
    public List<Specialite> getAllSpecialites() {
        return specialiteRepository.findAll();
    }

    @Override
    public Specialite addSpecialite(Specialite specialite) {
        return specialiteRepository.save(specialite);
    }

    @Override
    public boolean updateSpecialite(Specialite specialite) {
        if (specialiteRepository.save(specialite) != null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteSpecialite(Long id) {
        if (specialiteRepository.existsById(id)) {
            specialiteRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Specialite> findById(Long id) {
        return specialiteRepository.findById(id);
    }

}
