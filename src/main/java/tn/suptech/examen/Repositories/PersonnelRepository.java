package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Personnel;


@Repository
public interface PersonnelRepository extends JpaRepository <Personnel , Long> {
}
