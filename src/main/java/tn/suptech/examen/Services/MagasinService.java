package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Magasin;

import tn.suptech.examen.Repositories.MagasinRepository;

import java.util.List;

@Service
public class MagasinService {


    @Autowired
    private MagasinRepository magasinRepository;

    public List<Magasin> getAll() {

        return this.magasinRepository.findAll();
    }


    public Magasin createMagasin(Magasin magasin) {

        return this.magasinRepository.save(magasin);
    }

    public Magasin updateMagasin(Magasin magasin) {

        return this.magasinRepository.save(magasin);
    }

    public boolean deleteMagasin(Long mid) {
        try {
            this.magasinRepository.deleteById(mid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Magasin getMagasinById(Long mid){
        return this.magasinRepository.getById(mid);
    }
}
