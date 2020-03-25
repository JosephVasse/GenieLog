package com.projet.classes;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Magasin
 *
 */
@Entity

public class Magasin implements Serializable {

	   
	@Id
	private int IdMag;
	private String nomMag;
	private String adresseMag;
	private static final long serialVersionUID = 1L;

	public Magasin() {
		super();
	}   
	public int getIdMag() {
		return this.IdMag;
	}

	public void setIdMag(int IdMag) {
		this.IdMag = IdMag;
	}   
	public String getNomMag() {
		return this.nomMag;
	}

	public void setNomMag(String nomMag) {
		this.nomMag = nomMag;
	}   
	public String getAdresseMag() {
		return this.adresseMag;
	}

	public void setAdresseMag(String adresseMag) {
		this.adresseMag = adresseMag;
	}
   
}
