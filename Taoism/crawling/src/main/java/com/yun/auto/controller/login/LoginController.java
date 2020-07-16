package com.yun.auto.controller.login;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {

    @RequestMapping(value = "logIn")
    public ModelAndView logIn(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("login/login");
    }


    @RequestMapping(value="/")
    public ModelAndView GoToIndex(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("index");
    }

}
