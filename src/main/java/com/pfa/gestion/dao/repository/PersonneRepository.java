package com.pfa.gestion.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfa.gestion.dao.entity.Personne;

public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
