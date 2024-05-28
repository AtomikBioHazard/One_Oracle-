package com.aluracursos.literatura.model;

public enum Language {
  ES("es"),
  FR("fr"),
  EN("en"),
  PT("pt");

  private String language;

  Language(String language) {
    this.language = language;
  }

  public String getLanguage() {
    return this.language;
  }

  public static Language fromString(String text) {
    for (Language b : Language.values()) {
      if (b.language.equalsIgnoreCase(text)) {
        return b;
      }
    }

    throw new IllegalArgumentException("No constant with text: " + text + " found");
  }
}
