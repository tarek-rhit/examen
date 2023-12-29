package tn.suptech.examen.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.suptech.examen.Entities.CategoriePavillon;

import tn.suptech.examen.Services.CategoriePavillonService;

import java.util.List;

@RestController
@RequestMapping("/categoriePavillon")
public class CategoriePavillonController {

    @Autowired
    private CategoriePavillonService categoriePavillonService;

    @GetMapping("/categoriesPavillons")
    public List<CategoriePavillon> getAll(){

        return this.categoriePavillonService.getAll();
    }


    @PostMapping("/save")
    public CategoriePavillon createCategoriePavillon(@RequestBody CategoriePavillon categoriePavillon){

        return this.categoriePavillonService.createCategoriePavillon(categoriePavillon);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public CategoriePavillon updateCategoriePavillon (@RequestBody CategoriePavillon categoriePavillon){

        return this.categoriePavillonService.updateCategoriePavillon(categoriePavillon);
    }

    @DeleteMapping("/{cpid}")
    public boolean deleteCategoriePavillon (@PathVariable Long cpid){
        return
                this.categoriePavillonService.deleteCategoriePavillon(cpid);
    }
    @GetMapping("/{cpid}")
    public CategoriePavillon getCategoriePavillonById(@PathVariable Long cpid){
        return this.categoriePavillonService.getCategoriePavillonById(cpid);
    }
}
