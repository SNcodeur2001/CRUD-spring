package com.edu.iset4c.formation.SpringBoot.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //identifie que la classe est une entité
public class Utilisateur implements Serializable{
	private Long id;
	private String firstName;
	private String LastName;
	private String email;
	private String password;
	private Date starterDate;
	private int age;
	private Boolean active;
	
	@Id //identifie que la classe est un iD
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	//cette annotation indique à JPA 
	//de laisser la base de données générer automatiquement les valeurs des clés 
	//primaires lors de l'insertion d'une nouvelle entité
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getStarterDate() {
		return starterDate;
	}
	public void setStarterDate(Date starterDate) {
		this.starterDate = starterDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
}	
