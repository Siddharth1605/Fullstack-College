package com.reg727821tuit137.desanthiri.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reg727821tuit137.desanthiri.model.Travel;
import com.reg727821tuit137.desanthiri.service.Travelservice;

@RestController
@RequestMapping()
public class Travelcontroller {

	@Autowired
	Travelservice service;
	
	@GetMapping("get")
	public Iterable<Travel> getTravellers()
	{
		return service.get();
	}
	
	@GetMapping("/show/{id}")
	public Optional<Travel> getTravelById(@PathVariable("id") int id)
	{
		return service.getbyid(id);
	}
	
	@PostMapping("/post")
	public String createTraveller(@RequestBody Travel travel)
	{
		Optional<Travel> _travel = service.create(travel);
		if(_travel.isPresent())
		{
			return "Data is created";
		}
		else
		{
			return "Data already exists";
		}
	}
	
	@PutMapping("/put")
	public String updateTraveller(@RequestBody Travel travel)
	{
		Optional<Travel> _travel = service.create(travel);
		if(_travel.isPresent())
		{
			return "Data is created";
		}
		else
		{
			return "Data already exists";
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteTraveller(@PathVariable("id") int id)
	{
		return service.delete(id);
	}
	
}
