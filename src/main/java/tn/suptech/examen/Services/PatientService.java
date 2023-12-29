package tn.suptech.examen.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Patient;
import tn.suptech.examen.Repositories.PatientRepository;

import java.util.List;


@Service
public class PatientService {


    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAll() {

        return this.patientRepository.findAll();
    }


    public Patient createPatient(Patient patient) {

        return this.patientRepository.save(patient);
    }

    public Patient updatePatient(Patient patient) {

        return this.patientRepository.save(patient);
    }

    public boolean deletePatient(Long pid) {
        try {
            this.patientRepository.deleteById(pid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Patient getPatientById(Long pid){
        return this.patientRepository.getById(pid);
    }
}
