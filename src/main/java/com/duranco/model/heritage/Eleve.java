package com.duranco.model.heritage;

import javax.persistence.Entity;

@Entity
public class Eleve extends Personne {
String groupe,niveau;

public String getGroupe() {
	return groupe;
}

public void setGroupe(String groupe) {
	this.groupe = groupe;
}

public String getNiveau() {
	return niveau;
}

public void setNiveau(String niveau) {
	this.niveau = niveau;
}





}
