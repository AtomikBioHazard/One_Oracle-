package com.aluracursos.conversorDivisas.models;

import java.util.Map;

public record ExchangeRateResponse(String result, String baseCode, ConversionRates conversionRates) {
  public record ConversionRates(Map<String, Double> rates) {}
}
