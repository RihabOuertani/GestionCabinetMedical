package com.pfa.gestion.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pfa.gestion.dao.IConsultationDao;
import com.pfa.gestion.dao.entity.Consultation;
import com.pfa.gestion.dao.repository.ConsultationRepository;

@Repository
public class ConsultationDaoImpl implements IConsultationDao {

    @Autowired
    private ConsultationRepository consultationRepository;

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public Consultation addConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

    @Override
    public boolean updateConsultation(Consultation consultation) {
        if (consultationRepository.save(consultation)!=null)
            return true;
        else
            return false;
    }

    @Override
    public boolean deletConsultation(Long id) {
        if(consultationRepository.existsById(id)) {
            consultationRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Consultation> findById(Long id) {
        return consultationRepository.findById(id);
    }

}
