package com.example.ToDolist.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDolist.Entidades.Usuario;
import com.example.ToDolist.Repositorios.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;
    
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscarPorId(int id) {
        return usuarioRepository.findById(id);
    }

    public void deletar(int id) {
        usuarioRepository.deleteById(id);
    }

     public Optional<Usuario> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public boolean existeEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }

}
