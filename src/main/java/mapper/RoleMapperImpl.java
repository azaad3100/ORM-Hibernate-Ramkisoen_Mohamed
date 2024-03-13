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
}
