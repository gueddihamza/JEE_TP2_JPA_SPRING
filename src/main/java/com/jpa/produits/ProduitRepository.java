package com.jpa.produits;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
