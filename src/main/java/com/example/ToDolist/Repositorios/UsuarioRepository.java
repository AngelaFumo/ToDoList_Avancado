package com.example.ToDolist.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ToDolist.Entidades.Usuario;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
     Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);

    Optional<Usuario> findByNome(String nome);
    
}
