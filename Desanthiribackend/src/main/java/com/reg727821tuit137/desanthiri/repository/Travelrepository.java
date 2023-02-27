package com.reg727821tuit137.desanthiri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.reg727821tuit137.desanthiri.model.Travel;

public interface Travelrepository  extends CrudRepository<Travel, Integer>, JpaRepository<Travel,Integer>{

}
