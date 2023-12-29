package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Lit;

@Repository
public interface LitRepository extends JpaRepository <Lit,Long> {
}
