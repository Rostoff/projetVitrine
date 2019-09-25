package com.rostoff.projetvitrine.dao;

import com.rostoff.projetvitrine.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Grace à l'inversion de contrôle, Spring a déja crée un webService générique RESTfull
@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
