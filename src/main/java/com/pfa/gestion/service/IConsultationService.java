package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Consultation;

@Service
public interface IConsultationService {

    List<Consultation> getAllConsultations();
    Consultation add(Consultation consultation);
    boolean update(Consultation consultation);
    boolean deleteById(Long id);
    Consultation findById(Long id);
}
