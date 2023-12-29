package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture ,Long> {
}
