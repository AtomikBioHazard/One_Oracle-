package com.alurachallenge.foro.models.dto.tema;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TemaActualizarDTO {
  @NotNull
  @Size(min = 3, message = "El título debe tener al menos 3 caracteres")
  @Size(max = 150, message = "El título es muy grande")
  private String titulo;

  @NotNull
  @Size(min = 3, message = "El contenido debe tener al menos 3 caracteres")
  @Size(max = 500, message = "El contenido es muy grande")
  private String contenido;

  @NotNull
  private Genero genero;
}
