package com.alurachallenge.foro.infra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.alurachallenge.foro.model.Usuario;
import com.alurachallenge.foro.repository.UsuarioRepository;

@Service
public class AuthenticationService implements UserDetailsService {
  @Autowired
  private UsuarioRepository usuarioRepository;

  @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      Usuario usuario = usuarioRepository.findByUsername(username);

      if (usuario == null) {
        throw new UsernameNotFoundException("Usuario no encontrado");
      }

      return usuario;
    }
}
