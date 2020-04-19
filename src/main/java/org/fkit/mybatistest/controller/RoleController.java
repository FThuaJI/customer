package org.fkit.mybatistest.controller;

import org.fkit.mybatistest.bean.Role;
import org.fkit.mybatistest.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleService roleService;

    @RequestMapping("/findRole")
    public String findRole(Model model){
        List<Role> roles=roleService.findAllRole();
        model.addAttribute("roles",roles);
        return "role";
    }

    @RequestMapping("/findLike")
    public String findLike(String role_name,String role_industry,Model model){
        List<Role> roles=roleService.findNameAndIndustry(role_name,role_industry);
        model.addAttribute("roles",roles);
        return "role";
    }

    @RequestMapping("/insertRole")
    @ResponseBody
    public String insertRole(Role role){
        int ok=roleService.insertRole(role);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/editRole")
    @ResponseBody
    public Role editRole(Integer role_id){
        Role customer=roleService.editRole(role_id);
        return customer;
    }

    @RequestMapping("/updateRole")
    @ResponseBody
    public String updateRole(Role role){
        int ok=roleService.updateRole(role);
        if (ok>0) {
            return "OK";
        }else {
            return "FALL";
        }
    }

    @RequestMapping("/deleteRole")
    @ResponseBody
    public String deleteRole(Integer role_id){
        System.out.println(role_id);
        int ok=roleService.deleteRole(role_id);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }
}
