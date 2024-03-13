package service;

import configuration.JPAConfiguration;
import entity.Role;
import repository.RoleRepository;

import java.util.List;

public class RoleService {

    private RoleRepository roleRepository;

    public RoleService() {
        this.roleRepository = new RoleRepository(JPAConfiguration.getEntityManager());
    }

    public List<Role> getRoles(){
        return roleRepository.getAllRoles();
    }

    public Role createRole(Role role){
        return roleRepository.createRole(role);
    }
}
