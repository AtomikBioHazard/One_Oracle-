package com.alurachallenge.foro.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.alurachallenge.foro.dto.DatosActualizarTopico;
import com.alurachallenge.foro.dto.DatosRegistroTopico;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String titulo;
  private String mensaje;

  @CreationTimestamp
  private LocalDateTime fechaCreacion;

  @Enumerated(EnumType.STRING)
  private Curso curso;

  public Topico(DatosRegistroTopico datosRegistroTopico) {
    this.titulo = datosRegistroTopico.titulo();
    this.mensaje = datosRegistroTopico.mensaje();
    this.fechaCreacion = LocalDateTime.now();
    this.curso = datosRegistroTopico.curso();
  }

  public void actualizarInformacion(DatosActualizarTopico datosActualizarTopico) {
    if (datosActualizarTopico.titulo() != null) {
      this.titulo = datosActualizarTopico.titulo();
    }

    if (datosActualizarTopico.mensaje() != null) {
      this.mensaje = datosActualizarTopico.mensaje();
    }
  }
}
