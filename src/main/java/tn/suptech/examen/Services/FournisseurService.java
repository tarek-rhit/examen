package tn.suptech.examen.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Fournisseur;

import tn.suptech.examen.Repositories.FournisseurRepository;


import java.util.List;

@Service
public class FournisseurService {

    @Autowired
    private FournisseurRepository fournisseurRepository;


    public List<Fournisseur> getAll() {
        return fournisseurRepository.findAll();

    }




    public Fournisseur createFournisseur(Fournisseur fournisseur) {

        return this.fournisseurRepository.save(fournisseur);
    }

    public Fournisseur updateFournisseur(Fournisseur fournisseur) {

        return this.fournisseurRepository.save(fournisseur);
    }

    public boolean deleteFournisseur(Long fid) {
        try {
            this.fournisseurRepository.deleteById(fid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Fournisseur getFournisseurById(Long pid){
        return this.fournisseurRepository.getById(pid);
    }
}
