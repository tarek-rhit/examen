package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Pavillon;


@Repository
public interface PavillonRepository extends JpaRepository <Pavillon ,Long> {
}
