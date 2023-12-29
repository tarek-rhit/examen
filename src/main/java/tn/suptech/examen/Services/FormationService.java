package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Formation;

import tn.suptech.examen.Repositories.FormationRepository;

import java.util.List;

@Service
public class FormationService {

    @Autowired
    private FormationRepository formationRepository;


    public List<Formation> getAll() {

        return this.formationRepository.findAll();
    }


    public Formation createFormation(Formation formation) {

        return this.formationRepository.save(formation);
    }

    public Formation updateFormation(Formation formation) {

        return this.formationRepository.save(formation);
    }

    public boolean deleteFormation(Long fid) {
        try {
            this.formationRepository.deleteById(fid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Formation getFormationById(Long fid){

        return this.formationRepository.getById(fid);
    }
}
