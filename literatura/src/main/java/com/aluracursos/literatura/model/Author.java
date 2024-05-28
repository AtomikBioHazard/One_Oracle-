package com.aluracursos.literatura.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "autores")
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(unique = true)
  private String nombre;
  private Integer fechaNacimiento;
  private Integer fechaDefuncion;
  @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Book> books;

  public Author() {
  }

  public Author(AuthorData authorData) {
    this.nombre = authorData.nombre();
    this.fechaNacimiento = authorData.fechaNacimiento();
    this.fechaDefuncion = authorData.fechaDefuncion();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(Integer fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public Integer getFechaDefuncion() {
    return fechaDefuncion;
  }

  public void setFechaDefuncion(Integer fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    books.forEach(l -> l.setAuthor(this));
    this.books = books;
  }

  @Override
  public String toString() {
    return "\n***** *** Author *** *****\n" + 
      "Author ID: " + id +
      ", Nombre: " + nombre + '\n' +
      ", Fecha de Nacimiento: " + fechaNacimiento +
      ", Fecha de Defunción: " + fechaDefuncion;
  }
}
