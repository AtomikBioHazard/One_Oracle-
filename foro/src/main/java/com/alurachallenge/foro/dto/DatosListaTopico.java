package com.alurachallenge.foro.dto;

import com.alurachallenge.foro.model.Curso;
import com.alurachallenge.foro.model.Topico;

public record DatosListaTopico(
  Long id, String titulo, String mensaje, Curso curso
) {
  public DatosListaTopico(Topico topico) {
    this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getCurso());
  }
}
