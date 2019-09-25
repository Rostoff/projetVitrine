package com.rostoff.projetvitrine;

import com.rostoff.projetvitrine.dao.CategorieRepository;
import com.rostoff.projetvitrine.dao.ProduitRepository;
import com.rostoff.projetvitrine.entities.Categorie;
import com.rostoff.projetvitrine.entities.Produit;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class ProjetVitrineApplication implements CommandLineRunner {

    //Autowired sert à injecter une implémentation de cette interface
    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private CategorieRepository categorieRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetVitrineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        categorieRepository.save(new Categorie("Cahiers", null, null));
        categorieRepository.save(new Categorie("Livres", null, null));
        categorieRepository.save(new Categorie("Stylos", null, null));

        Random rnd = new Random();
        categorieRepository.findAll().forEach(c -> {
            Produit p = new Produit();
            p.setName(RandomString.make(18));
            p.setPrixActuel(100 + rnd.nextInt(1000));
            p.setEnStock(rnd.nextBoolean());
            p.setPromotion(rnd.nextBoolean());
            p.setSelected(rnd.nextBoolean());
            p.setCategorie(c);
            produitRepository.save(p);
        });
    }
}
