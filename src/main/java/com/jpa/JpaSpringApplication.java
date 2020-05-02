package com.jpa;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.entities.Categorie;
import com.jpa.entities.Produit;
import com.jpa.produits.CategorieRepository;
import com.jpa.produits.ProduitRepository;

@SpringBootApplication
public class JpaSpringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(JpaSpringApplication.class, args);
		ProduitRepository dao = applicationContext.getBean(ProduitRepository.class);
		CategorieRepository cat = applicationContext.getBean(CategorieRepository.class);
		System.out.println("Ajout des produits ....................");
		Categorie c1 = cat.save(new Categorie("Electronics"));
		Categorie c2 = cat.save(new Categorie("Food"));
		Produit p1 = dao.save(new Produit("MAC", 10000, c1));
		Produit p2 =dao.save(new Produit("bimo", 2 , c2));
		Produit p3 =dao.save(new Produit("Smartphone", 6000 , c1));
		System.out.println("Trouver tous les produits ....................");
		 List<Produit> result=dao.findAll();
		for(Produit p : result) {
			System.out.println(p.getDesignation()+" "+p.getPrix() + " " + p.getCategorie().getNomCategorie());
			}
		
		System.out.println("Trouver un produit ....................");
		Produit p = dao.findById(3L).get();
		System.out.println(p.getDesignation()+" "+p.getPrix() + " " + p.getCategorie().getNomCategorie());
		
		System.out.println("Supprimer un produit ....................");
		dao.deleteById(3l);
		
		

	}
	
		
	
	

}
