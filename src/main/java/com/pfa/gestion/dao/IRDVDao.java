package com.pfa.gestion.dao;

import java.util.List;
import java.util.Optional;

import com.pfa.gestion.dao.entity.RDV;

public interface IRDVDao {

    List<RDV> getAllRdvs();

    RDV addRdv(RDV rdv);
    boolean updateRdv(RDV rdv);
    boolean deleteRdv(Long id);
    Optional<RDV> findById(Long id);

}
