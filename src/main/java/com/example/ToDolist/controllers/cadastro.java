package com.example.ToDolist.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/Autenticacao")
public class cadastro {

    
    @GetMapping("/registros")
    public String requestMethodName() {
        return "/Autenticacao/registro";
    }
    
   
}
