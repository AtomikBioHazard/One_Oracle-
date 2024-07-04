package com.alurachallenge.foro.models.dto.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RespuestaAutenticacionDTO {
  private String token;

  @JsonProperty("usuario")
  private PerfilUsuarioDto perfilUsuarioDto;
}
