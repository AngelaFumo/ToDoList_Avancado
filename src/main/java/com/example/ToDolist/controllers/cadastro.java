package com.example.ToDolist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDolist.Entidades.Usuario;
import com.example.ToDolist.Services.UsuarioService;



@RestController
@RequestMapping("/Autenticacao")
public class cadastro {
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/registros")
    public String requestMethodName() {
        return "/Autenticacao/registro";
    }
    
   @PostMapping("/registross")
    public ResponseEntity<Usuario> criar(@RequestBody Usuario usuario) {
        Usuario salvo = usuarioService.salvar(usuario);
        return ResponseEntity.ok(salvo);
    }

     @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

     @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable int id) {
        return usuarioService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable int id) {
        usuarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
