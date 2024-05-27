package com.aluracursos.literatura.principal;

import java.util.Scanner;

public class Principal {
  private Scanner keyboard = new Scanner(System.in);

  public void menu() {
    var option = -1;

    while (option != 9) {
      var myMenu = """
          *** *** *** *** *** *** *** ***
                    Literalura
          *** *** *** *** *** *** *** ***

          1 - Consultar Libro por Titulo
          2 - Consultar Autor por Nombre
          3 - Listar Libros Registrados
          4 - Listar Autores Registrados
          5 - Listar Autores Vivos por año
          6 - Listar Libros por Idioma
          7 - Top 10 Libros más Buscados
          8 - Generar Estadísticas

          9 - Salir
          *** *** *** *** *** *** *** ***

          Elige una opción: 
          """;

      System.out.println(myMenu);
      option = keyboard.nextInt();
      keyboard.nextLine();

      switch (option) {
        case 9:
          System.out.println("Hasta pronto!");
          break;

        default:
          System.out.println("Opción no válida");
          break;
      }
    }
  }
}
