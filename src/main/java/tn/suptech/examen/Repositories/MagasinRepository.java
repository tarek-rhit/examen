package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Magasin;

@Repository
public interface MagasinRepository extends JpaRepository <Magasin ,Long > {
}
