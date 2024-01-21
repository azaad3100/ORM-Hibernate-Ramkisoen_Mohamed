package entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;
    private String role_name;
    @OneToMany(mappedBy = "role_id")
    private Set<Employee> employees;

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
