package com.alurachallenge.foro.models.dto.respuesta;

import lombok.Data;

@Data
public class RespuestaTemaDTO {
  private Integer id;
  private String contenido;
  private Integer usuarioId;
  private String usuarioNombre;
}
