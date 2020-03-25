package com.projet.classes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Articles
 *
 */
@Entity

public class Articles implements Serializable {

    @Id
    private int               Id;
    private String            nomArticle;
    private String            upc;
    private float             prix;
    private int               IdCatg;
    private static final long serialVersionUID = 1L;

    public Articles() {
        super();
    }

    public int getId() {
        return this.Id;
    }

    public void setId( int Id ) {
        this.Id = Id;
    }

    public String getNomArticle() {
        return this.nomArticle;
    }

    public void setNomArticle( String nomArticle ) {
        this.nomArticle = nomArticle;
    }

    public String getUpc() {
        return this.upc;
    }

    public void setUpc( String upc ) {
        this.upc = upc;
    }

    public float getPrix() {
        return this.prix;
    }

    public void setPrix( float prix ) {
        this.prix = prix;
    }

    public int getIdCatg() {
        return this.IdCatg;
    }

    public void setIdCatg( int IdCatg ) {
        this.IdCatg = IdCatg;
    }

}
