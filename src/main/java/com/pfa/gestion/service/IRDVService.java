package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.RDV;

@Service
public interface IRDVService {

    List<RDV> getAlRdvs();

    RDV add(RDV rdv);
    boolean update(RDV rdv);
    boolean deleteById(Long id);
    RDV findById(Long id);
}
