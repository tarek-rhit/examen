package tn.suptech.examen.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.suptech.examen.Entities.Patient;
@Repository
public interface PatientRepository extends JpaRepository <Patient, Long> {
}
