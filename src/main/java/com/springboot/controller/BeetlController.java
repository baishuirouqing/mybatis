package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeetlController {

    @RequestMapping("beetl")
    public String helloBeetl(Model model){
        model.addAttribute("beetl","Hello My First Beetl");
        return  "hello";
    }
}
