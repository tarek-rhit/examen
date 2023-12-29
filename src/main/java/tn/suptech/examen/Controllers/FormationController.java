package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Formation;

import tn.suptech.examen.Services.FormationService;

import java.util.List;

@RestController
@RequestMapping("/formation")
public class FormationController {
    @Autowired
     private FormationService formationService;


    @GetMapping("/formations")
    public List<Formation> getAll(){

        return this.formationService.getAll();
    }


    @PostMapping("/save")
    public Formation createFormation(@RequestBody Formation formationt){

        return this.formationService.createFormation(formationt);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Formation updateFormation (@RequestBody Formation formation){
        return this.formationService.updateFormation(formation);
    }

    @DeleteMapping("/{fid}")
    public boolean deleteFormation (@PathVariable Long fid){

        return this.formationService.deleteFormation(fid);

    }
    @GetMapping("/{fid}")
    public Formation getFormationById(@PathVariable Long fid){
        return this.formationService.getFormationById(fid);
    }
}
