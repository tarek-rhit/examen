package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.suptech.examen.Entities.Pavillon;
import tn.suptech.examen.Repositories.PavillonRepository;

import java.util.List;

@Service
public class PavillonService {


    @Autowired
    private PavillonRepository pavillonRepository;

    public List<Pavillon> getAll() {

        return this.pavillonRepository.findAll();
    }


    public Pavillon createPavillon(Pavillon pavillon) {

        return this.pavillonRepository.save(pavillon);
    }

    public Pavillon updatePavillon(Pavillon pavillon) {

        return this.pavillonRepository.save(pavillon);
    }

    public boolean deletePavillon(Long pid) {
        try {
            this.pavillonRepository.deleteById(pid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Pavillon getPavillonById(Long pid){

        return this.pavillonRepository.getById(pid);
    }
}
