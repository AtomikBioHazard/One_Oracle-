package com.alurachallenge.foro.dto;

import java.time.LocalDateTime;

import com.alurachallenge.foro.model.Curso;
import com.alurachallenge.foro.model.Topico;

public record DatosDetalleTopico(
  String titulo,
  String mensaje,
  LocalDateTime fechaCreacion,
  Curso curso
) {
    public DatosDetalleTopico(Topico topico) {
      this(topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getCurso());
    }
}
