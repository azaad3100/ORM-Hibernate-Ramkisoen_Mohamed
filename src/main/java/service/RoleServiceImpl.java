package service;

import configuration.JPAConfiguration;
import dto.RoleDto;
import mapper.RoleMapper;
import mapper.RoleMapperImpl;
import repository.RoleRepository;
import service.RoleServiceInterface;

import java.util.List;

public class RoleServiceImpl implements RoleServiceInterface {
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl() {
        this.roleRepository = new RoleRepository(JPAConfiguration.getEntityManager());
        this.roleMapper = new RoleMapperImpl();
    }

    @Override
    public List<RoleDto> getAllRoles() {
        return roleMapper.toDtoList(roleRepository.getAllRoles());
    }

    @Override
    public RoleDto addRole(RoleDto roleDto) {
        return roleMapper.toDto(roleRepository.addRole(roleMapper.toEntity(roleDto)));
    }
}
