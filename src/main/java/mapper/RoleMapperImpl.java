package mapper;

import dto.RoleDto;
import entity.Role;
import mapper.RoleMapper;

import java.util.ArrayList;
import java.util.List;

public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleDto toDto(Role role) {
        RoleDto roleDto = new RoleDto();
        roleDto.setRole_id(role.getRole_id());
        roleDto.setRole_name(role.getRole_name());
        roleDto.setRole_description(role.getRole_description());
        return roleDto;
    }

    @Override
    public List<RoleDto> toDtoList(List<Role> list) {
        List<RoleDto> roleDtoList = new ArrayList<>();

        for (Role role : list) {
            roleDtoList.add(toDto(role));
        }
        return roleDtoList;
    }

    @Override
    public Role toEntity(RoleDto roleDto) {
        Role role = new Role();
        role.setRole_id(roleDto.getRole_id());
        role.setRole_name(roleDto.getRole_name());
        role.setRole_description(roleDto.getRole_description());
        return role;
    }

    @Override
    public List<Role> toEntityList(List<RoleDto> dtoList) {
        List<Role> list = new ArrayList<>();

        for (RoleDto roleDto : dtoList) {
            list.add(toEntity(roleDto));
        }
        return list;
    }
}
