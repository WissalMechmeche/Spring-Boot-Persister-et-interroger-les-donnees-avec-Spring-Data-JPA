package com.wissal.enseignants.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDep;
	private String nomDep;
	private String descriptionDep;
	
	@JsonIgnore
	@OneToMany(mappedBy = "departement")
	private List<Enseignant> enseignants;
	
	

	public Departement() {
	}

	public Departement(String nomDep, String descriptionDep, List<Enseignant> enseignants) {
		super();
		this.nomDep = nomDep;
		this.descriptionDep = descriptionDep;
		this.enseignants = enseignants;
	}

	public Long getIdDep() {
		return idDep;
	}

	public void setIdDep(Long idDep) {
		this.idDep = idDep;
	}

	public String getNomDep() {
		return nomDep;
	}

	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}

	public String getDescriptionDep() {
		return descriptionDep;
	}

	public void setDescriptionDep(String descriptionDep) {
		this.descriptionDep = descriptionDep;
	}

	public List<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
	
	
}
