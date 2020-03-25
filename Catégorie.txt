package com.projet.classes;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Catégorie
 *
 */
@Entity

public class Catégorie implements Serializable {

	   
	@Id
	private int IdCatégorie;
	private String nomCatégorie;
	private int taxeRate;
	private static final long serialVersionUID = 1L;

	public Catégorie() {
		super();
	}   
	public int getIdCatégorie() {
		return this.IdCatégorie;
	}

	public void setIdCatégorie(int IdCatégorie) {
		this.IdCatégorie = IdCatégorie;
	}   
	public String getNomCatégorie() {
		return this.nomCatégorie;
	}

	public void setNomCatégorie(String nomCatégorie) {
		this.nomCatégorie = nomCatégorie;
	}   
	public int getTaxeRate() {
		return this.taxeRate;
	}

	public void setTaxeRate(int taxeRate) {
		this.taxeRate = taxeRate;
	}
   
}
