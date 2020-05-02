package com.jpa.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUITS")
public class Produit implements Serializable {
	@Id
	@GeneratedValue
	private Long idProduit;
	private String designation;
	private double prix;

	@ManyToOne
	@JoinColumn(name = "ID_CAT")
	private Categorie categorie;

	public Produit(String designation, double prix, Categorie categorie) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.categorie = categorie;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Produit() {
		super();
	}

	public Produit(String designation, double prix) {
		super();
		this.designation = designation;
		this.prix = prix;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Long getIdProduit() {
		return idProduit;
	}

}
