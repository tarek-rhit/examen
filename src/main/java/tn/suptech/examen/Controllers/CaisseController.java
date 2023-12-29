package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Caisse;

import tn.suptech.examen.Services.CaisseService;

import java.util.List;

@RestController
@RequestMapping("/caisse")
public class CaisseController {


    @Autowired
    private CaisseService caisseService;

    @GetMapping("/caisses")
    public List<Caisse> getAll(){

        return this.caisseService.getAll();
    }


    @PostMapping("/save")
    public Caisse createCaisse(@RequestBody Caisse caisse){

        return this.caisseService.createCaisse(caisse);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Caisse updateCaisse (@RequestBody Caisse caisse){

        return this.caisseService.updateCaisse(caisse);
    }

    @DeleteMapping("/{cid}")
    public boolean deleteCaisse (@PathVariable Long cid){
        return
                this.caisseService.deleteCaisse(cid);
    }
    @GetMapping("/{cid}")
    public Caisse getCaisseById(@PathVariable Long cid){
        return this.caisseService.getCaisseById(cid);
    }
}
