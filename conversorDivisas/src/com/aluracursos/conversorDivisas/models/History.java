package com.aluracursos.conversorDivisas.models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class History {
  public static void registerConversion(double amount, String baseCode, double conversionResult, String targetCode) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("conversion_history.txt", true))) {
      LocalDateTime dateTime = LocalDateTime.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      String formattedDateTime = dateTime.format(formatter);

      String conversionRecord = String.format("[%s] %f %s -> %f %s", formattedDateTime, amount, baseCode, conversionResult, targetCode);

      writer.write(conversionRecord);
      writer.newLine();
    } catch (IOException e) {
      System.out.println("Error al escribir en el archivo de historial: " + e.getMessage());
    }
  }

  public static void displayConversionHistory() {
    try (BufferedReader reader = new BufferedReader(new FileReader("conversion_history.txt"))) {
      String line;

      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error al leer el archivo de historial: " + e.getMessage());
    }
  }
}
