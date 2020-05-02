package com.jpa.produits;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
