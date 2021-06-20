package com.pfa.gestion.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.gestion.dao.entity.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {

}
