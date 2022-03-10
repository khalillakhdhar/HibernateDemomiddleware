package com.duranco.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity(name = "student")
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "username", length = 50)
	@NotBlank
	private String studentName;
	@Column(columnDefinition = "Integer default 18", nullable = false)
	// si default est de type String columnDefinition = "varchar(255) default default 'valeur' "
	int age;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
