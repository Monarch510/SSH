package com.csu.wwj.action;

import com.csu.wwj.model.UserEntity;
import com.csu.wwj.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport {
    private UserEntity user;

    @Resource
    private UserService userService;

    public UserEntity getUser(){
        return user;
    }

    public String method1(){
        user = userService.getUser("wwj");
        System.out.println(user.getName());
        return SUCCESS;
    }

    public String saveUser(){
        UserEntity user = new UserEntity();
        user.setAge(20);
        user.setPhone("18373970220");
        user.setSex("male");
        userService.saveUser(user);
        return SUCCESS;
    }
}
