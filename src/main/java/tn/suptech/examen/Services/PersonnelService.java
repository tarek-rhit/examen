package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.suptech.examen.Entities.Personnel;
import tn.suptech.examen.Repositories.PersonnelRepository;

import java.util.List;

@Service
public class PersonnelService {

    @Autowired
    private PersonnelRepository personnelRepository;

    public List<Personnel> getAll() {

        return this.personnelRepository.findAll();
    }


    public Personnel createPersonnel(Personnel personnel) {

        return this.personnelRepository.save(personnel);
    }

    public Personnel updatePersonnel(Personnel personnel) {

        return this.personnelRepository.save(personnel);
    }

    public boolean deletePersonnel(Long pid) {
        try {
            this.personnelRepository.deleteById(pid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Personnel getPersonnelById(Long pid){
        return this.personnelRepository.getById(pid);

    }
}
