package tn.suptech.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.suptech.examen.Entities.Pharmacie;
import tn.suptech.examen.Services.PharmacieService;

import java.util.List;


@RestController
@RequestMapping("/pharmacie")
public class PharmacieController {


    @Autowired
    private PharmacieService pharmacieService;

    @GetMapping("/pharmacies")
    public List<Pharmacie> getAll(){

        return this.pharmacieService.getAll();
    }


    @PostMapping("/save")
    public Pharmacie createPharmacie(@RequestBody Pharmacie pharmacie){

        return this.pharmacieService.createPharmacie(pharmacie);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Pharmacie updatePharmacie (@RequestBody Pharmacie pharmacie){
        return this.pharmacieService.updatePharmacie(pharmacie);
    }

    @DeleteMapping("/{pid}")
    public boolean deletePharmacie (@PathVariable Long pid){

        return this.pharmacieService.deletePharmacie(pid);
    }
    @GetMapping("/{pid}")
    public Pharmacie getPharmacieById(@PathVariable Long pid){
        return this.pharmacieService.getPharmacieById(pid);
    }
}
