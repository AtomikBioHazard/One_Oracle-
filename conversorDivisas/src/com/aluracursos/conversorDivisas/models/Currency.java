package com.aluracursos.conversorDivisas.models;

import java.util.Map;
import java.util.stream.Collectors;

public record Currency(String base_code, String target_code, Map<String, Double> conversion_rates, double conversionRate) {

  /**
   * Filtra la tasa de conversión para la moneda objetivo especificada.
   *
   * @param conversionRates Mapa de tasas de conversión.
   * @param targetCode      Código de la moneda objetivo.
   * @return Tasa de conversión para la moneda objetivo.
   * @throws TargetCurrencyNotFoundException Si el código de moneda objetivo no se encuentra en el mapa de tasas.
   */
  public double currencyFilter(Map<String, Double> conversionRates, String targetCode) throws TargetCurrencyNotFoundException {
    if (conversionRates == null) {
      throw new IllegalArgumentException("El mapa de tasas de conversión no puede ser nulo");
    }

    Map<String, Double> filteredRates = conversionRates.entrySet()
      .stream()
      .filter(entry -> entry.getKey().equals(targetCode))
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    if (filteredRates.isEmpty()) {
      throw new TargetCurrencyNotFoundException("Código de moneda objetivo no encontrado: " + targetCode);
    }

    // Devuelve la tasa de conversión para el código de moneda objetivo
    return filteredRates.values().iterator().next();
  }

  /**
   * Convierte la cantidad especificada a la moneda objetivo utilizando la tasa de conversión proporcionada.
   *
   * @param amount         Cantidad a convertir.
   * @param conversionRate Tasa de conversión.
   * @param targetCode     Código de la moneda objetivo.
   * @return Cantidad convertida.
   */
  public double convertAmount(double amount, double conversionRate, String targetCode) {
    double conversionResult = amount * conversionRate;
    System.out.println("El valor: " + amount + "(" + base_code() + ")" + " es igual " + conversionResult + "(" + target_code + ")");
    return conversionResult;
  }
}
