package mapper;

import dto.RoleDto;
import entity.Role;

import java.util.List;

public interface RoleMapper {

    RoleDto toDto(Role role);
    List<RoleDto> toDtoList(List<Role> list);

}
