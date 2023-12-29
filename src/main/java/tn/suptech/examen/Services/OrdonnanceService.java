package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Ordonnance;

import tn.suptech.examen.Repositories.OrdonnanceRepository;

import java.util.List;

@Service
public class OrdonnanceService {

@Autowired
    private OrdonnanceRepository ordonnanceRepository;

    public List<Ordonnance> getAll() {

        return this.ordonnanceRepository.findAll();
    }


    public Ordonnance createOrdonnance(Ordonnance ordonnance) {

        return this.ordonnanceRepository.save(ordonnance);
    }

    public Ordonnance updateOrdonnance(Ordonnance ordonnance) {

        return this.ordonnanceRepository.save(ordonnance);
    }

    public boolean deleteOrdonnance(Long oid) {
        try {
            this.ordonnanceRepository.deleteById(oid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Ordonnance getOrdonnanceById(Long oid){

        return this.ordonnanceRepository.getById(oid);
    }

}


