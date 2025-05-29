package com.example.ToDolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Autenticacao")
public class Ajuda {
    @GetMapping("/Ajuda")
    public String controllerAjuda(){
        return ("/Autenticacao/ajuda");
    }
    
}
