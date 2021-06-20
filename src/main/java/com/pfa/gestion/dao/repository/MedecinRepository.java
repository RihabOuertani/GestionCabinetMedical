package com.pfa.gestion.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.gestion.dao.entity.Medecin;
import org.springframework.web.bind.annotation.CrossOrigin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

}
