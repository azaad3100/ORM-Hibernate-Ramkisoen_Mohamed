package controller;

import entity.Role;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import service.RoleService;
import service.reportService;

import java.util.List;

@Path("/inventory")
public class InventoryController {
    @Path("/hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String report() {
        return "ola amigos";
    }

}


