package com.pfa.gestion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pfa.gestion.dao.entity.Specialite;
@Service
public interface ISpecialiteService {

    List<Specialite> getAllSpecialites();
    Specialite add(Specialite  specialite);
    boolean update(Specialite specialite);
    boolean deleteById(Long id);
    Specialite findById(Long id);

}
