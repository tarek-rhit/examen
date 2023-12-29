package tn.suptech.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Patient;
import tn.suptech.examen.Services.PatientService;

import java.util.List;

@RestController
@RequestMapping(path = "/patient")
public class PatientController {


    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> getAll(){

        return patientService.getAll();
    }


    @PostMapping("/save")
    public Patient createPatient(@RequestBody Patient patient){

        return patientService.createPatient(patient);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Patient updatePatient (@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    @DeleteMapping("/{pid}")
    public boolean deletePatient (@PathVariable Long pid){
        return patientService.deletePatient(pid);
    }
    @GetMapping("/{pid}")
    public Patient getPatientById(@PathVariable Long pid){
        return patientService.getPatientById(pid);
    }
}
