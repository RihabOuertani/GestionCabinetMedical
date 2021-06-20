package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.Specialite;

public interface ISpecialiteDao {

    List<Specialite> getAllSpecialites();
    Specialite addSpecialite(Specialite specialite);
    boolean updateSpecialite(Specialite specialite);
    boolean deleteSpecialite(Long id);
    Optional<Specialite> findById(Long id);

}
