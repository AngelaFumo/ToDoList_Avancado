package com.example.ToDolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Autenticacao")
public class conta {

    @GetMapping("/conta")
    public String controllerConta(){
        return ("/Autenticacao/conta");
    }
    
}
