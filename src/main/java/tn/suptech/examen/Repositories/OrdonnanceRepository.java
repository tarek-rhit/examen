package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Ordonnance;


@Repository
public interface OrdonnanceRepository extends JpaRepository <Ordonnance ,Long> {
}
