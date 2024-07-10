package com.alurachallenge.foro.exceptions;

public class ResourceNotFoundException extends RuntimeException {
  public ResourceNotFoundException() {
    super();
  }

  public ResourceNotFoundException(String s) {
    super(s);
  }
}
