package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Produit;

@Repository
public interface ProduitRepository extends JpaRepository <Produit, Long>{
}
