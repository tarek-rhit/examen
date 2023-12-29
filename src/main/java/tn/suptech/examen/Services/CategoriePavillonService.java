package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.suptech.examen.Entities.CategoriePavillon;

import tn.suptech.examen.Repositories.CategoriePavillonRepository;

import java.util.List;

@Service
public class CategoriePavillonService {


    @Autowired
    private CategoriePavillonRepository categoriePavillonRepository;

    public List<CategoriePavillon> getAll() {

        return this.categoriePavillonRepository.findAll();
    }


    public CategoriePavillon createCategoriePavillon(CategoriePavillon categoriePavillon) {

        return this.categoriePavillonRepository.save(categoriePavillon);
    }

    public CategoriePavillon updateCategoriePavillon(CategoriePavillon categoriePavillon) {

        return this.categoriePavillonRepository.save(categoriePavillon);
    }

    public boolean deleteCategoriePavillon(Long cpid) {
        try {
            this.categoriePavillonRepository.deleteById(cpid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public CategoriePavillon getCategoriePavillonById(Long cpid){

        return this.categoriePavillonRepository.getById(cpid);
    }
}
