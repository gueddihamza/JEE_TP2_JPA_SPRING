package com.jpa.entities;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Categorie implements Serializable {
	@Id
	@GeneratedValue
	private Long id_categorie;
	private String nomCategorie;
	@OneToMany(mappedBy = "categorie", fetch = FetchType.LAZY)
	private Collection<Produit> produits;

	public Long getId_categorie() {
		return id_categorie;
	}

	public void setId_categorie(Long id_categorie) {
		this.id_categorie = id_categorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	public Categorie(String nomCategorie) {
		super();
		this.nomCategorie = nomCategorie;
	}
	
	

	public Categorie() {
		super();
	}
}
