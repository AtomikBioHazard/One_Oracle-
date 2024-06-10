package com.aluracursos.literatura.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aluracursos.literatura.models.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
  Autor findByNombre(String nombre);

    @Query("SELECT a FROM Autor a WHERE a.fechaNacimiento >= :fecha")
    List<Autor> autorVivoDesde(@Param("fecha") String fecha);
}
