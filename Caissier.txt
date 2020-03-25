package com.projet.classes;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Caissier
 *
 */
@Entity

public class Caissier implements Serializable {

    @Id
    private int               IdCaissier;
    private String            nom;
    private static final long serialVersionUID = 1L;

    public Caissier() {
        super();
    }

    public int getIdCaissier() {
        return this.IdCaissier;
    }

    public void setIdCaissier( int IdCaissier ) {
        this.IdCaissier = IdCaissier;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom( String nom ) {
        this.nom = nom;
    }

}
