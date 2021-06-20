package com.pfa.gestion.dao.repository;

import com.pfa.gestion.dao.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.gestion.dao.entity.RDV;

import java.util.List;

public interface RDVRepository extends JpaRepository<RDV, Long> {

    List<RDV> findByPatient(Patient patient);
}
