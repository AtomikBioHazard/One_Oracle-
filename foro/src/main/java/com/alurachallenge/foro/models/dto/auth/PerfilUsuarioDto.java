package com.alurachallenge.foro.models.dto.auth;

import com.alurachallenge.foro.models.dto.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PerfilUsuarioDto {
  private String nombre;
  private String email;
  private String password;
  private Role role;
}
