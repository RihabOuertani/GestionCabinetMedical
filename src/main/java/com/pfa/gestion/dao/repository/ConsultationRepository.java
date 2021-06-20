package com.pfa.gestion.dao.repository;

import com.pfa.gestion.dao.entity.RDV;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.gestion.dao.entity.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

    //Consultation findConsultationByRdv_Id(Long rdvId);

    //Consultation findConsultationByRdv(RDV rdv);


}
