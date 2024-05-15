package com.aluracursos.conversorDivisas.models;

public class ConversionProcess {
  public static void changeProcess(Currency currency, double amount, String targetCode) {
    double exchangeRate = 0;

    try {
      exchangeRate = currency.currencyFilter(currency.conversion_rates(), targetCode);
      double conversionResult = currency.convertAmount(amount, exchangeRate, targetCode);

      // Registrar la conversión en el historial
      History.registerConversion(amount, currency.base_code(), conversionResult, targetCode);
    } catch (TargetCurrencyNotFoundException | NullPointerException e) {
      System.out.println("Error: código inválido: " + e.getMessage());
    }

    currency.convertAmount(amount, exchangeRate, targetCode);
  }
}
