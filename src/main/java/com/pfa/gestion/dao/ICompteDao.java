package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Compte;

public interface ICompteDao {

    List<Compte> getAllComptes();


    Compte addCompte(Compte compte);
    boolean updateCompte(Compte compte);
    boolean deleteCompte(Long id);
    Optional<Compte> findById(Long id);

}
