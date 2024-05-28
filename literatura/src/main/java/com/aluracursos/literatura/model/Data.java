package com.aluracursos.literatura.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Data(
  @JsonAlias("results") List<BookData> bookDatas,
  @JsonAlias("count") Integer total
) {
}