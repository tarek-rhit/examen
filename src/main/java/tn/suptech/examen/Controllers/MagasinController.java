package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Magasin;

import tn.suptech.examen.Services.MagasinService;

import java.util.List;

@RestController
@RequestMapping("/magasin")
public class MagasinController {

    @Autowired
    private MagasinService magasinService;

    @GetMapping("/magasins")
    public List<Magasin> getAll(){

        return this.magasinService.getAll();
    }


    @PostMapping("/save")
    public Magasin createMagasin(@RequestBody Magasin magasin){

        return this.magasinService.createMagasin(magasin);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Magasin updateMagasin (@RequestBody Magasin magasin){

        return this.magasinService.updateMagasin(magasin);
    }

    @DeleteMapping("/{mid}")
    public boolean deleteMagasin (@PathVariable Long mid){

        return this.magasinService.deleteMagasin(mid);
    }
    @GetMapping("/{mid}")
    public Magasin getMagasinById(@PathVariable Long mid){
        return this.magasinService.getMagasinById(mid);
    }

}
