package com.pfa.gestion.dao.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.gestion.dao.entity.Compte;

public interface CompteRepository extends JpaRepository<Compte, Long> {

}
