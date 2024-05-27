package com.aluracursos.literatura.principal;

import java.util.Scanner;

public class Principal {
  private Scanner keyboard = new Scanner(System.in);

  public void menu() {
    var option = -1;

    while (option != 9) {
      var myMenu = """
          *** Literalura ***
          9 - Salir
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
