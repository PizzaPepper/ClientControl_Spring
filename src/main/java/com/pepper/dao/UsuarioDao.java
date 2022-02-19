package com.pepper.dao;

import com.pepper.domain.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario,Long>{
    Usuario findByUsername(String username); // Parte del Spring
}
