package com.reg727821tuit137.desanthiri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Journeydetails")
public class Travel {

	@Id
	private int id;
	private String name;
	private String location;
	private String email;
	
	public Travel(int id, String name, String location, String email) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public Travel()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	
}
