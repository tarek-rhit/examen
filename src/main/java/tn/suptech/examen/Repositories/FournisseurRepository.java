package tn.suptech.examen.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Fournisseur;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
}
