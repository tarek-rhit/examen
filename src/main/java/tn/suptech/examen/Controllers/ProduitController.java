package tn.suptech.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.suptech.examen.Entities.Produit;
import tn.suptech.examen.Services.ProduitService;


import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {

    @Autowired
    private ProduitService produitService;


    @GetMapping("/produits")
    public List<Produit> getAll(){

        return this.produitService.getAll();
    }


    @PostMapping("/save")
    public Produit createProduit(@RequestBody Produit produit){

        return this.produitService.createProduit(produit);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Produit updateProduit (@RequestBody Produit produit){

        return this.produitService.updateProduit(produit);
    }

    @DeleteMapping("/{pid}")
    public boolean deleteProduit (@PathVariable Long pid){
        return
                this.produitService.deleteProduit(pid);
    }
    @GetMapping("/{pid}")
    public Produit getProduitById(@PathVariable Long pid){
        return this.produitService.getProduitById(pid);
    }
}
