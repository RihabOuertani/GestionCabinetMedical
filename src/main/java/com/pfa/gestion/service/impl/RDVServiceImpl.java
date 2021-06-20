package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.IRDVDao;
import com.pfa.gestion.dao.entity.RDV;
import com.pfa.gestion.service.IRDVService;

@Service
public class RDVServiceImpl implements IRDVService {

    @Autowired
    private IRDVDao rdvDao;

    @Override
    public List<RDV> getAlRdvs() {
        return rdvDao.getAllRdvs();
    }

    @Override
    public RDV add(RDV rdv) {
        return rdvDao.addRdv(rdv);
    }

    @Override
    public boolean update(RDV rdv) {
        return rdvDao.updateRdv(rdv);
    }

    @Override
    public boolean deleteById(Long id) {
        return rdvDao.deleteRdv(id);
    }

    @Override
    public RDV findById(Long id) {
        Optional<RDV> rdvOptional=rdvDao.findById(id);
        return rdvOptional.orElseThrow(()-> new EntityNotFoundException("Rdv not found with id :" +id));
    }

}
