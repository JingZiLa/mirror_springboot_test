package com.mirror.mirror_springboot_test.controller;

import com.mirror.mirror_springboot_test.domain.User;
import com.mirror.mirror_springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    @RequestMapping("/list")
    public ModelAndView Lists(){
        ModelAndView modelAndView = new ModelAndView();
        List<User> list = userService.findAllUser();

        modelAndView.addObject("list",list);

        modelAndView.setViewName("list");
        return modelAndView;
    }

}
