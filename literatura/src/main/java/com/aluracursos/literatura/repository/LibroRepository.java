package com.aluracursos.literatura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aluracursos.literatura.models.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
  Libro findByTitulo(String titulo);

    List<Libro> findByidiomoasContaining(String idioma);
}
