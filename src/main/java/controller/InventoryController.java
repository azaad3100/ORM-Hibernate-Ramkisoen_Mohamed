package controller;

import dto.RoleDto;
import entity.Role;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
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

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RoleDto add(RoleDto roleDto) { return roleServiceInterface.addRole(roleDto);
    }

    @Path("/update")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RoleDto update(RoleDto roleDto) { return roleServiceInterface.updateRole(roleDto);
    }

    @Path("/remove/{roleID}")
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public int delete(@PathParam("roleID") Long roleID) {
        return roleServiceInterface.deleteRole(roleID);
    }

}


