package com.pfa.gestion.service.impl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import com.pfa.gestion.dto.ConsultationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.IConsultationDao;
import com.pfa.gestion.dao.entity.Consultation;
import com.pfa.gestion.service.IConsultationService;

@Service
public class ConsultationServiceImpl implements IConsultationService {

    @Autowired
    private IConsultationDao consultationDao;


    @Override
    public List<Consultation> getAllConsultations() {
        return consultationDao.getAllConsultations();	}

    @Override
    public Consultation add(Consultation consultation) {


        return consultationDao.addConsultation(consultation);
    }

    @Override
    public boolean update(Consultation consultation) {
        return consultationDao.updateConsultation(consultation);
    }

    @Override
    public boolean deleteById(Long id) {
        return consultationDao.deletConsultation(id);
    }

    @Override
    public Consultation findById(Long id) {
        Optional<Consultation> consultationOptional=consultationDao.findById(id);
        return consultationOptional.orElseThrow(()-> new EntityNotFoundException("consultation .." +id));
    }

}
