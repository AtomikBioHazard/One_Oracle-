package com.alurachallenge.foro.models.dto.respuesta;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RespuestaDTO {
  private Integer id;

  @NotNull
  @Size(min = 3, message = "La respuesta debe tener un mínimo de 3 caracteres")
  @Size(max = 150, message = "La respuesta es muy larga")
  private String contenido;

  @NotNull
  private Integer temaId;

  @NotNull
  private Integer usuarioId;

  private Boolean activo;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
}
