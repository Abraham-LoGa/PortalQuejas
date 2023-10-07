package com.portalquejas.portalquejas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.portalquejas.portalquejas.entities.Maker;

@Repository
public interface MakerRepository extends CrudRepository<Maker, Long>{

}