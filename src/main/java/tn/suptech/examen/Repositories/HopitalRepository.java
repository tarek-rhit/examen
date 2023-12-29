package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Hopital;

@Repository
public interface HopitalRepository extends JpaRepository <Hopital , Long > {
}
