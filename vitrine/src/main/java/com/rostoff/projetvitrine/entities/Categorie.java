package com.rostoff.projetvitrine.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Categorie implements Serializable {

    //On défini les entités qui seront des clases sérialisable
    //Grace à l'ibertion de contrôle, on les rend sérialisable avec une simple annotation

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "categorie") //Une catégorie peut contenir plusieurs produits
    private Collection<Produit> produits;

    public Categorie() {
    }

    public Categorie(String name, String description, Collection<Produit> produits) {
        this.name = name;
        this.description = description;
        this.produits = produits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Produit> getProduits() {
        return produits;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
}
