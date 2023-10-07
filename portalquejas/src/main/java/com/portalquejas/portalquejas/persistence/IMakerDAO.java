package com.portalquejas.portalquejas.persistence;

import java.util.List;
import java.util.Optional;

import com.portalquejas.portalquejas.entities.Maker;

public interface IMakerDAO {
    
    List<Maker> findAll();
    Optional <Maker> findById(Long id);
    void save( Maker maker);
    void deleteById(Long Id);


}
