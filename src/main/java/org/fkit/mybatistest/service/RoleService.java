package org.fkit.mybatistest.service;

import org.fkit.mybatistest.bean.Role;
import org.fkit.mybatistest.repository.RoleRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;

    public List<Role> findAllRole(){
        return roleRepository.findAllRole();
    }

    public List<Role> findNameAndIndustry(String role_name,String role_industry){
        return roleRepository.findNameAndIndustry(role_name,role_industry);
    }

    public int insertRole(Role role){
        return roleRepository.insertRole(role);
    }

    public Role editRole(Integer role_id){
        return roleRepository.editRole(role_id);
    }

    public int updateRole(Role role){
        return roleRepository.updateRole(role);
    }

    public int deleteRole(Integer role_id){
        return roleRepository.deleteRole(role_id);
    }
}
