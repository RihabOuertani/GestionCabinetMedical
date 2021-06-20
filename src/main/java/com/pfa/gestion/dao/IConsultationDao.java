package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Consultation;

public interface IConsultationDao {

    List<Consultation> getAllConsultations();
    Consultation addConsultation(Consultation consultation);
    boolean updateConsultation(Consultation consultation);
    boolean deletConsultation(Long id);
    Optional<Consultation> findById(Long id);
}
