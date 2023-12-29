package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Lit;

import tn.suptech.examen.Services.LitService;

import java.util.List;

@RestController
@RequestMapping("/lit")
public class LitController {

    @Autowired
    private LitService litService;

    @GetMapping("/lits")
    public List<Lit> getAll(){

        return this.litService.getAll();
    }


    @PostMapping("/save")
    public Lit createLit(@RequestBody Lit lit){

        return this.litService.createLit(lit);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Lit updateLit (@RequestBody Lit lit){
        return
                this.litService.updateLit(lit);
    }

    @DeleteMapping("/{lid}")
    public boolean deleteLit (@PathVariable Long lid){

        return this.litService.deleteLit(lid);
    }
    @GetMapping("/{lid}")
    public Lit getLitById(@PathVariable Long lid){
        return this.litService.getLitById(lid);
    }
}
