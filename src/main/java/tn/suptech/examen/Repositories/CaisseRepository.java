package tn.suptech.examen.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Caisse;

@Repository
public interface CaisseRepository extends JpaRepository <Caisse , Long> {
}
