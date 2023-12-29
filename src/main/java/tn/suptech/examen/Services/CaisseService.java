package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Caisse;

import tn.suptech.examen.Repositories.CaisseRepository;

import java.util.List;

@Service
public class CaisseService {

    @Autowired
    private CaisseRepository caisseRepository;

    public List<Caisse> getAll() {

        return this.caisseRepository.findAll();
    }


    public Caisse createCaisse(Caisse caisse) {

        return this.caisseRepository.save(caisse);
    }

    public Caisse updateCaisse(Caisse caisse) {

        return this.caisseRepository.save(caisse);
    }

    public boolean deleteCaisse(Long cid) {
        try {
            this.caisseRepository.deleteById(cid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Caisse getCaisseById(Long cid){

        return this.caisseRepository.getById(cid);
    }
}
