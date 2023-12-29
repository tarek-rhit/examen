package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Pharmacie;


@Repository
public interface PharmacieRepository extends JpaRepository <Pharmacie , Long> {
}
