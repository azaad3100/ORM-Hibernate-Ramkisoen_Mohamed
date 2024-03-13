package controller;

import dto.RoleDto;
import entity.Role;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import service.RoleService;
import service.RoleServiceImpl;
import service.RoleServiceInterface;

import java.util.List;

@Path("/inventory")
public class InventoryController {

    private final RoleService roleService;
    private RoleServiceInterface roleServiceInterface = new RoleServiceImpl();

    public InventoryController() {
        this.roleService = new RoleService();
    }

    @Path("/hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Role> getRoles(){
        return roleService.getRoles();
    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<RoleDto> getAllRoles() {
        return roleServiceInterface.getAllRoles();
    }
}


