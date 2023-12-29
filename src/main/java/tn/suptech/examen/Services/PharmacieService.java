package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.suptech.examen.Entities.Pharmacie;
import tn.suptech.examen.Repositories.PharmacieRepository;

import java.util.List;

@Service
public class PharmacieService {


    @Autowired
    private PharmacieRepository pharmacieRepository;


    public List<Pharmacie> getAll() {

        return this.pharmacieRepository.findAll();
    }


    public Pharmacie createPharmacie(Pharmacie pharmacie) {

        return this.pharmacieRepository.save(pharmacie);
    }

    public Pharmacie updatePharmacie(Pharmacie pharmacie) {

        return this.pharmacieRepository.save(pharmacie);
    }

    public boolean deletePharmacie(Long phid) {
        try {
            this.pharmacieRepository.deleteById(phid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Pharmacie getPharmacieById(Long phid){

        return this.pharmacieRepository.getById(phid);
    }
}
