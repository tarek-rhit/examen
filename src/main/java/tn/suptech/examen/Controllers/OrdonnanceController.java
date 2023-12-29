package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Ordonnance;

import tn.suptech.examen.Services.OrdonnanceService;

import java.util.List;

@RestController
@RequestMapping("/ordonnance")
public class OrdonnanceController {

    @Autowired
    private OrdonnanceService ordonnanceService;


    @GetMapping("/ordonnances")
    public List<Ordonnance> getAll(){

        return this.ordonnanceService.getAll();
    }


    @PostMapping("/save")
    public Ordonnance createOrdonnance(@RequestBody Ordonnance ordonnance){

        return this.ordonnanceService.createOrdonnance(ordonnance);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Ordonnance updateOrdonnance (@RequestBody Ordonnance ordonnance){
        return this.ordonnanceService.updateOrdonnance(ordonnance);
    }

    @DeleteMapping("/{oid}")
    public boolean deleteOrdonnance (@PathVariable Long oid){

        return this.ordonnanceService.deleteOrdonnance(oid);
    }
    @GetMapping("/{oid}")
    public Ordonnance getOrdonnanceById(@PathVariable Long oid){
        return this.ordonnanceService.getOrdonnanceById(oid);
    }
}
