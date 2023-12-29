package tn.suptech.examen.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.suptech.examen.Entities.Role;
import tn.suptech.examen.Repositories.RoleRepository;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAll() {

        return this.roleRepository.findAll();
    }


    public Role createRole(Role role) {

        return this.roleRepository.save(role);
    }

    public Role updateRole(Role role) {

        return this.roleRepository.save(role);
    }

    public boolean deleteRole(Long rid) {
        try {
            this.roleRepository.deleteById(rid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public Role getRoleById(Long rid){

        return this.roleRepository.getById(rid);
    }

}
