package com.cum.luv2code.spring.thymeleafdemo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DemoController {

    //create a mapping for /hello
    @GetMapping("/hello")
    public String saHello(Model theModel){
        theModel.addAttribute("theDate",java.time.LocalDateTime.now());
        return "Hello World";
    }
}
