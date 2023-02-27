package com.reg727821tuit137.desanthiri.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reg727821tuit137.desanthiri.model.Travel;
import com.reg727821tuit137.desanthiri.repository.Travelrepository;

@Service
public class Travelservice {

	@Autowired
	Travelrepository repo;
	
	public Iterable<Travel> get()
	{
		return repo.findAll();
	}
	
	public Optional<Travel> getbyid(int id)
	{
		return repo.findById(id);
	}
	
	public Optional<Travel> create(Travel travel)
	{
		if(repo.existsById(travel.getId()))
		{
			return Optional.empty();
		}
		else
		{
			return Optional.of(repo.save(travel));
		}
		
	}
	
	public Optional<Travel> update(Travel travel)
	{
		if(repo.existsById(travel.getId()))
		{
			return Optional.of(repo.save(travel));
		}
		else
		{
			return Optional.empty();
		}
	}
	
	public String delete(int id)
	{
		if(repo.existsById(id))
		{	
			repo.deleteById(id);
			return id + " deleted successfully";
		}
		else
		{
			return id + " not exists";
		}
	}
	
}
