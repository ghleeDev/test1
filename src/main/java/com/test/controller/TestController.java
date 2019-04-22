package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping(value = "test1")
    public String tmpl(Model model){
        model.addAttribute("id", 1);
        model.addAttribute("name", "이건희");
        model.addAttribute("photo", "images/test.png");
        return "test1";
    }
}
