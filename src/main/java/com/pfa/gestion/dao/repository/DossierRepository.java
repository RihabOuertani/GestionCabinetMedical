package com.pfa.gestion.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.gestion.dao.entity.Dossier;

public interface DossierRepository extends JpaRepository<Dossier, Long> {

}
