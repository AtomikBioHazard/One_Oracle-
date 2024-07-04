package com.alurachallenge.foro.models.dto.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SolicitudAutenticacionDTO {
  @NotNull
  @NotBlank
  @Email
  private String email;

  @NotEmpty
  @NotBlank
  @Pattern(regexp = "[a-z0-9]+")
  @Size(min = 8, message = "La contraseña debe tener mínimo 8 caracteres")
  private String password;
}
