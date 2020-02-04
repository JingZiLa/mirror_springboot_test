package com.mirror.mirror_springboot_test.controller;

import com.mirror.mirror_springboot_test.domain.User;
import com.mirror.mirror_springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

}
