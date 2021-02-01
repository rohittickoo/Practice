package com.example.myCompany.company.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	private long id;
	private String name;
	private String description;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public static void main(String[] args) {
		Company com = new Company(1,"rohit",null);
		System.out.println(com);
		
	}

}
