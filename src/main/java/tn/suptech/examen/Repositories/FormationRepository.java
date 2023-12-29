package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Formation;

@Repository
public interface FormationRepository extends JpaRepository <Formation , Long> {
}
