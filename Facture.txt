package com.projet.classes;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Facture
 *
 */
@Entity

public class Facture implements Serializable {

	   
	@Id
	private int IdFact;
	private int IdArticle;
	private int IdCommande;
	private int qteArticle;
	private static final long serialVersionUID = 1L;

	public Facture() {
		super();
	}   
	public int getIdFact() {
		return this.IdFact;
	}

	public void setIdFact(int IdFact) {
		this.IdFact = IdFact;
	}   
	public int getIdArticle() {
		return this.IdArticle;
	}

	public void setIdArticle(int IdArticle) {
		this.IdArticle = IdArticle;
	}   
	public int getIdCommande() {
		return this.IdCommande;
	}

	public void setIdCommande(int IdCommande) {
		this.IdCommande = IdCommande;
	}   
	public int getQteArticle() {
		return this.qteArticle;
	}

	public void setQteArticle(int qteArticle) {
		this.qteArticle = qteArticle;
	}
   
}
