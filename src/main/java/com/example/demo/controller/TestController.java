package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Type;

@Controller
public class TestController {
    @RequestMapping("/home")
    public void fun(){
        System.out.println("aa");
    }
    @RequestMapping("/html")
    @ResponseBody
    public String  html(HttpServletRequest request, HttpServletResponse response,Model model){
        Cookie cookie = new Cookie("token","addf");
        response.addCookie(cookie);
        return "<head></head><script src='http://192.168.12.20:8080/js'>" +
                "</script><body>hahaha</body>";
    }
    @RequestMapping("/js")
    public String  js(){
        return "xss.js";
    }
    @RequestMapping("/xss")
    public void getCookie(String cookie){
        System.out.println(cookie);

    }
}
