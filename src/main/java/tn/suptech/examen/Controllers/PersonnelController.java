package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.suptech.examen.Entities.Personnel;
import tn.suptech.examen.Services.PersonnelService;

import java.util.List;

@RestController
@RequestMapping("/personnel")
public class PersonnelController {

    @Autowired
    private PersonnelService personnelService;


    @GetMapping("/personnels")
    public List<Personnel> getAll(){

        return this.personnelService.getAll();
    }


    @PostMapping("/save")
    public Personnel createPersonnel(@RequestBody Personnel personnel){

        return this.personnelService.createPersonnel(personnel);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Personnel updatePersonnel (@RequestBody Personnel personnel){
        return this.personnelService.updatePersonnel(personnel);
    }

    @DeleteMapping("/{pid}")
    public boolean deletePersonnel (@PathVariable Long pid){
        return this.personnelService.deletePersonnel(pid);
    }
    @GetMapping("/{pid}")
    public Personnel getPersonnelById(@PathVariable Long pid){
        return this.personnelService.getPersonnelById(pid);
    }
}
