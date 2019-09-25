package com.rostoff.projetvitrine.entities;

import javax.persistence.*;
import java.io.Serializable;

//Avec Lombok, on peut déclarer un constructeur bien plus simplement via des annotations
@Entity
public class Produit implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double prixActuel;
    private boolean promotion;
    private boolean selected;
    private boolean enStock;
    private String nomPhoto;
    @ManyToOne //Plusieurs produits peuvent être contenu dans une categorie
    private Categorie categorie;

    public Produit() {
    }

    public Produit(String name, String description, double prixActuel, boolean promotion, boolean selected, boolean enStock, String nomPhoto, Categorie categorie) {
        this.name = name;
        this.description = description;
        this.prixActuel = prixActuel;
        this.promotion = promotion;
        this.selected = selected;
        this.enStock = enStock;
        this.nomPhoto = nomPhoto;
        this.categorie = categorie;
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

    public double getPrixActuel() {
        return prixActuel;
    }

    public void setPrixActuel(double prixActuel) {
        this.prixActuel = prixActuel;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isEnStock() {
        return enStock;
    }

    public void setEnStock(boolean enStock) {
        this.enStock = enStock;
    }

    public String getNomPhoto() {
        return nomPhoto;
    }

    public void setNomPhoto(String nomPhoto) {
        this.nomPhoto = nomPhoto;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
