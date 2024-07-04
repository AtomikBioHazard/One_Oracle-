package com.alurachallenge.foro.models.dto.usuario;

import java.time.LocalDateTime;

import com.alurachallenge.foro.models.dto.Role;

import lombok.Data;

@Data
public class UsuarioDTO {
  private Integer id;
  private String nombre;
  private String email;
  private String password;
  private Role role;
  private String filePerfil;
  private Boolean activo;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
