package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.IRDVDao;
import com.pfa.gestion.dao.entity.RDV;
import com.pfa.gestion.dao.repository.RDVRepository;

@Repository
public class RDVDaoImpl implements IRDVDao {

    @Autowired
    private RDVRepository rdvRepository;

    @Override
    public List<RDV> getAllRdvs() {
        return rdvRepository.findAll();
    }

    @Override
    public RDV addRdv(RDV rdv) {
        return rdvRepository.save(rdv);
    }

    @Override
    public boolean updateRdv(RDV rdv) {
        if(rdvRepository.save(rdv)!=null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deleteRdv(Long id) {
        if(rdvRepository.existsById(id)) {
            rdvRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<RDV> findById(Long id) {
        return rdvRepository.findById(id);
    }

}
