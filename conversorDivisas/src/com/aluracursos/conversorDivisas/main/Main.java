package com.aluracursos.conversorDivisas.main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String welcomeMsg = "\n Bienvenido(a) al conversor de monedas \n";

    String menu = """
        1 - USD a MXN
        2 - MXN a USD
        3 - USD a PER
        4 - PER a USD
        5 - USD a ARG
        6 - ARG a USD
        7 - Más opciones de conversión
        8 - Historial de conversiones
        0 - Salir
        """;

    String byeMessage = "\n Gracias por su visita \n";

    System.out.println(welcomeMsg);

    var terminar = false;

    while (true) {
      System.out.println(menu);

      try {
        var opcion = scanner.nextInt();

        if (opcion == 0) {
          break;
        }

      } catch (Exception e) {
        // TODO: handle exception
      }
    }
    
    System.out.println(byeMessage);
  }
}
