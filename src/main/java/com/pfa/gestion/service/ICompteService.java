package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Compte;

@Service
public interface ICompteService {

    List<Compte> getAllComptes();

    Compte add(Compte compte);

    boolean update(Compte compte);

    boolean deleteById(Long id);

    Compte findById(Long id);

}
