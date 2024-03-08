package repository;

import entity.Role;
import jakarta.persistence.EntityManager;
import java.util.List;

public class RoleRepository {

    private EntityManager entityManager;
    private static List<Role> roleList;

    public RoleRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Role createRole(Role role) {
        try {
            //entityManager.getTransaction().begin();
            entityManager.persist(role);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return role;
    }

    public List<Role> findAll() {
        return roleList;
    }

}
