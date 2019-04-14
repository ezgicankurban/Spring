package com.ecankurban.deneme.model;

import java.util.Date;

public class User {
	
	private Long id;
	private String name;
	private Date birthday;
	
	
	
	private Owner owner;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public Owner getOwner() {
		return owner;
	}



	public void setOwner(Owner owner) {
		this.owner = owner;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + ", owner=" + owner + "]";
	}
	
	

}
