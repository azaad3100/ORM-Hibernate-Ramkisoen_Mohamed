package service;

import dto.RoleDto;

import java.util.List;

public interface RoleServiceInterface {

    List<RoleDto> getAllRoles();

    RoleDto addRole(RoleDto roleDto);

    RoleDto updateRole(RoleDto roleDto);
}
