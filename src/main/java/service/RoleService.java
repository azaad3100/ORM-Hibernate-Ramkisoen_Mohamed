package service;

import configuration.JPAConfiguration;
import entity.Role;
import repository.RoleRepository;

public class RoleService {

    private RoleRepository roleRepository;

    public RoleService() {
        this.roleRepository = new RoleRepository(JPAConfiguration.getEntityManager());
    }

    public Role createRole(Role role){
        return roleRepository.createRole(role);
    }
}
