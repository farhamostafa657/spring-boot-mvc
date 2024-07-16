package com.thymeleafdemo.thymeleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        return "hellowrld";
    }
    @RequestMapping("/processForm")
    public String processForm(Model theModel){
        return "heloworld";
    }
    @RequestMapping("/processFormVersionTwo")
    public String letshutdude(@RequestParam("studentName") String theName, Model theModel){
        //String theName=request.getParameter("studentName");
        theName=theName.toUpperCase();
        String result="Yo"+theName;
        theModel.addAttribute("message",result);
        return "helloworld-form";
    }
}
