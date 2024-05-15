package com.aluracursos.conversorDivisas.main;

import java.util.Scanner;

import com.aluracursos.conversorDivisas.models.ApiConnection;
import com.aluracursos.conversorDivisas.models.ConversionProcess;
import com.aluracursos.conversorDivisas.models.Currency;
import com.aluracursos.conversorDivisas.models.History;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String targetCode;
    String baseCode;
    double amount = 0;

    String welcomeMsg = "\n Bienvenido(a) al conversor de monedas \n";

    String menu = """
        Elige una opción:

        1 - USD a MXN
        2 - MXN a USD
        3 - USD a PEN
        4 - PEN a USD
        5 - USD a ARS
        6 - ARS a USD
        7 - Más opciones de conversión
        8 - Historial de conversiones
        0 - Salir
        """;

    String byeMessage = "\n Gracias por su visita \n";

    System.out.println(welcomeMsg);

    while (true) {
      System.out.println(menu);

      try {
        var opcion = scanner.nextInt();

        if (opcion == 0) {
          break;
        }

        if (opcion >= 1 && opcion <= 7) {
          System.out.println("Ingresa la cantidad a convertir: ");
          amount = scanner.nextDouble();
        }

        ApiConnection request = new ApiConnection();

        Currency currency = request.getApiData("USD");

        switch (opcion) {
          case 1:
            targetCode = "MXN";
            ConversionProcess.changeProcess(currency, amount, targetCode);
            break;
          case 2:
            targetCode = "USD";
            currency = request.getApiData("MXN");
            ConversionProcess.changeProcess(currency, amount, targetCode);
            break;
          case 3:
            targetCode = "PEN";
            ConversionProcess.changeProcess(currency, amount, targetCode);
            break;
          case 4:
            targetCode = "USD";
            currency = request.getApiData("PEN");
            ConversionProcess.changeProcess(currency, amount, targetCode);
            break;
          case 5:
            targetCode = "ARS";
            ConversionProcess.changeProcess(currency, amount, targetCode);
            break;
          case 6:
            targetCode = "USD";
            currency = request.getApiData("ARS");
            ConversionProcess.changeProcess(currency, amount, targetCode);
            break;
          case 7:
            System.out.println("Listado de códigos de moneda: ");
            currency.conversion_rates().forEach((code, rate) -> System.out.println(code));

            System.out.println("Ingresa el código de moneda que va a cambiar: ");
            baseCode = scanner.next();
            baseCode = baseCode.toUpperCase();

            System.out.println("Ingrese el código de la moneda de cambio: ");
            targetCode = scanner.next();
            targetCode = targetCode.toUpperCase();

            currency = request.getApiData(baseCode);
            ConversionProcess.changeProcess(currency, amount, targetCode);
            break;
          case 8:
            System.out.println("Historial de Conversiones: ");
            History.displayConversionHistory();
            break;
          default:
            System.out.println("Opción no válida");
            break;
        }

      } catch (Exception e) {
        System.out.println("Ha ocurrido un error: " + e.getMessage());
      }
    }

    System.out.println(byeMessage);
  }
}
