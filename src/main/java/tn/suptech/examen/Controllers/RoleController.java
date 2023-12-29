package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.suptech.examen.Entities.Role;
import tn.suptech.examen.Services.RoleService;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {


    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public List<Role> getAll(){

        return this.roleService.getAll();
    }


    @PostMapping("/save")
    public Role createRole(@RequestBody Role role){

        return this.roleService.createRole(role);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Role updateRole (@RequestBody Role role){
        return this.roleService.updateRole(role);
    }

    @DeleteMapping("/{rid}")
    public boolean deleteRole (@PathVariable Long rid){
        return this.roleService.deleteRole(rid);
    }
    @GetMapping("/{rid}")
    public Role getRoleById(@PathVariable Long rid){
        return this.roleService.getRoleById(rid);
    }
}
