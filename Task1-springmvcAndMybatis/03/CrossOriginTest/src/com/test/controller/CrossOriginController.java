package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(maxAge = 3600)
@Controller
public class CrossOriginController {

    @CrossOrigin(origins = "https://localhost:8080/VariableTests")
    @GetMapping(value = "/welcome")
    public String welcome(){
        System.out.println("¥¶¿ÌøÁ”Ú«Î«Û");
        return "welcome";
    }

}
