package tn.suptech.examen.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.suptech.examen.Entities.Hopital;

import tn.suptech.examen.Repositories.HopitalRepository;

import java.util.List;

@Service
public class HopitalService {


    @Autowired
    private HopitalRepository hopitalRepository;

    public List<Hopital> getAll() {

        return this.hopitalRepository.findAll();
    }


    public Hopital createHopital(Hopital hopital) {

        return this.hopitalRepository.save(hopital);
    }

    public Hopital updateHopital(Hopital hopital) {

        return this.hopitalRepository.save(hopital);
    }

    public boolean deleteHopital(Long hid) {
        try {
            this.hopitalRepository.deleteById(hid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Hopital getHopitalById(Long hid){

        return this.hopitalRepository.getById(hid);
    }
}
