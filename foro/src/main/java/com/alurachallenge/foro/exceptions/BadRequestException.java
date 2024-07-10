package com.alurachallenge.foro.exceptions;

import java.io.IOException;

import org.springframework.dao.DataAccessException;

public class BadRequestException extends RuntimeException {
  public BadRequestException(String s) {
    super(s);
  }

  public BadRequestException(String s, DataAccessException e) {
    super(s, e);
  }

  public BadRequestException(String s, IOException e) {
    super(s, e);
  }
}
