package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.CategoriePavillon;


@Repository
public interface CategoriePavillonRepository extends JpaRepository <CategoriePavillon,Long> {
}
