package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.suptech.examen.Entities.Pavillon;
import tn.suptech.examen.Services.PavillonService;

import java.util.List;

@RestController
@RequestMapping("/pavillon")
public class PavillonController {

    @Autowired
    private PavillonService pavillonService;

    @GetMapping("/pavillons")
    public List<Pavillon> getAll(){

        return this.pavillonService.getAll();
    }


    @PostMapping("/save")
    public Pavillon createPavillon(@RequestBody Pavillon pavillon){

        return this.pavillonService.createPavillon(pavillon);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Pavillon updatePavillon (@RequestBody Pavillon pavillon){
        return this.pavillonService.updatePavillon(pavillon);
    }

    @DeleteMapping("/{pid}")
    public boolean deletePavillon (@PathVariable Long pid){
        return this.pavillonService.deletePavillon(pid);
    }
    @GetMapping("/{pid}")
    public Pavillon getPavillonById(@PathVariable Long pid){
        return this.pavillonService.getPavillonById(pid);
    }
}
