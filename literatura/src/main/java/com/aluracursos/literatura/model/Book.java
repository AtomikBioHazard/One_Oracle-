package com.aluracursos.literatura.model;

import java.util.stream.Collectors;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(unique = true)
  private String titulo;
  @Enumerated(EnumType.STRING)
  private Language idioma;
  @ManyToOne
  @JoinColumn(name = "id", nullable = false)
  private Author author;
  private String copyright;
  private Integer descargas;

  public Book() {
  }
  
  public Book(BookData bookData) {
    this.id = bookData.id();
    this.titulo = bookData.titulo();
    this.idioma = Language.fromString(bookData.idiomas().stream()
        .limit(1).collect(Collectors.joining()));
    this.copyright = bookData.copyright();
    this.descargas = bookData.descargas();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Language getIdioma() {
    return idioma;
  }

  public void setIdioma(Language idioma) {
    this.idioma = idioma;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public String getCopyright() {
    return copyright;
  }

  public void setCopyright(String copyright) {
    this.copyright = copyright;
  }

  public Integer getDescargas() {
    return descargas;
  }

  public void setDescargas(Integer descargas) {
    this.descargas = descargas;
  }

  @Override
  public String toString() {
    return "\n***** *** Book *** *****\n" + 
      "Book ID: " + id +
      ", Titulo: " + titulo + '\'' +
      ", Idioma: " + idioma +
      ", Autor: " + author + '\'' +
      ", copyright: " + copyright +
      ", descargas: " + descargas;
  }
}
