package tn.suptech.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Fournisseur;
import tn.suptech.examen.Services.FournisseurService;

import java.util.List;

@RestController
@RequestMapping(path = "/fournisseur")
public class FournisseurController {

    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping("/fournisseurs")
    public List<Fournisseur> getAll(){

        return this.fournisseurService.getAll();
    }


    @PostMapping("/save")
    public Fournisseur createFournisseur(@RequestBody Fournisseur fournisseur){

        return this.fournisseurService.createFournisseur(fournisseur);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Fournisseur updateFournisseur (@RequestBody Fournisseur fournisseur){
        return this.fournisseurService.updateFournisseur(fournisseur);
    }

    @DeleteMapping("/{fid}")
    public boolean deleteFournisseur (@PathVariable Long fid){
        return this.fournisseurService.deleteFournisseur(fid);
    }
    @GetMapping("/{fid}")
    public Fournisseur getFournisseurById(@PathVariable Long fid){
        return this.fournisseurService.getFournisseurById(fid);
    }
}
