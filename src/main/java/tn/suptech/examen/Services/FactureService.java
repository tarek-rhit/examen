package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Facture;

import tn.suptech.examen.Repositories.FactureRepository;

import java.util.List;

@Service
public class FactureService {


    @Autowired
    private FactureRepository factureRepository;

    public List<Facture> getAll() {

        return this.factureRepository.findAll();
    }


    public Facture createFacture(Facture facture) {

        return this.factureRepository.save(facture);
    }

    public Facture updateFacture(Facture facture) {

        return this.factureRepository.save(facture);
    }

    public boolean deleteFacture(Long fid) {
        try {
            this.factureRepository.deleteById(fid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Facture getFactureById(Long fid){

        return this.factureRepository.getById(fid);
    }
}
