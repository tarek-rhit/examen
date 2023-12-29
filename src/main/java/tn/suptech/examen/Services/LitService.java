package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Lit;

import tn.suptech.examen.Repositories.LitRepository;

import java.util.List;

@Service
public class LitService {


    @Autowired
    private LitRepository litRepository;

    public List<Lit> getAll() {

        return this.litRepository.findAll();
    }


    public Lit createLit(Lit lit) {

        return this.litRepository.save(lit);
    }

    public Lit updateLit(Lit lit) {

        return this.litRepository.save(lit);
    }

    public boolean deleteLit(Long lid) {
        try {
            this.litRepository.deleteById(lid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Lit getLitById(Long lid){
        return this.litRepository.getById(lid);
    }
}
