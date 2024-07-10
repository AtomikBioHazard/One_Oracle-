package com.alurachallenge.foro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alurachallenge.foro.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
  Usuario findByLogin(String login);
}
