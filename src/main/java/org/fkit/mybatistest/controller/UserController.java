package org.fkit.mybatistest.controller;

import org.fkit.mybatistest.bean.User;
import org.fkit.mybatistest.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/insertUser")
    public String insertUser(String loginName, String username, String password){

        userService.insertUser(loginName,username,password);
        return "login";
    }

    @RequestMapping("/findUser")
    public String findUser(String username, String password, Model model, HttpSession session){

        User user= userService.findUser(username,password);
        if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
            session.setAttribute("loginName",user.getLoginName());
            session.setAttribute("user",user);
        }else{
            return "login";
        }
        return "redirect:/customer/findAll";
    }

    @RequestMapping("/findAllUser")
    public String findAllUser(Model model){
        List<User> users=userService.findAllUser();
        model.addAttribute("users",users);
        return "user";
    }

    @RequestMapping("/editUser")
    @ResponseBody
    public User editUser(Integer id){
        User user=userService.editUser(id);
        return user;
    }

    @RequestMapping("/updateUser")
    @ResponseBody
    public String updateUser(User user){
        int ok=userService.updateUser(user);
        if (ok>0) {
            return "OK";
        }else {
            return "FALL";
        }
    }

    @RequestMapping("/deleteUser")
    @ResponseBody
    public String deleteUser(Integer id){
        System.out.println(id);
        int ok=userService.deleteUser(id);
        if (ok>0){
            return "OK";
        }else{
            return "FALL";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "login";
    }
}
