package repository;

import entity.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class RoleRepository {

    private EntityManager entityManager;

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

    public List<Role> getAllRoles() {
        String sql = "select w from Role w";
        TypedQuery<Role> typedQuery = entityManager.createQuery(sql, Role.class);
        List<Role> role = typedQuery.getResultList();
        return role;
    }

    public Role addRole(Role role){
        entityManager.getTransaction().begin();
        entityManager.merge(role);
        entityManager.getTransaction().commit();
        return role;
    }
}
