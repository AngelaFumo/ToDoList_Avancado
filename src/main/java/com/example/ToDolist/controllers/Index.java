package com.example.ToDolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/")
public class Index {
    
    @GetMapping("/Login")
    public String exibirFormularioLogin() {
        return "index"; 
    }

    
}

