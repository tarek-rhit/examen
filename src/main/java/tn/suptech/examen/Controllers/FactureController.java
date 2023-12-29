package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Facture;

import tn.suptech.examen.Services.FactureService;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {

    @Autowired
    private FactureService factureService;

    @GetMapping("/factures")
    public List<Facture> getAll(){

        return this.factureService.getAll();
    }


    @PostMapping("/save")
    public Facture createFacture(@RequestBody Facture facture){

        return this.factureService.createFacture(facture);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Facture updateFacturet (@RequestBody Facture facture){

        return this.factureService.updateFacture(facture);
    }

    @DeleteMapping("/{fid}")
    public boolean deleteFacture (@PathVariable Long fid){
        return
                this.factureService.deleteFacture(fid);
    }
    @GetMapping("/{fid}")
    public Facture getFactureById(@PathVariable Long fid){
        return this.factureService.getFactureById(fid);
    }
}
