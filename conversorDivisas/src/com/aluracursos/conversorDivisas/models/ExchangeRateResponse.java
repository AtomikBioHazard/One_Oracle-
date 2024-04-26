package com.aluracursos.conversorDivisas.models;

import java.util.Map;

import com.google.gson.JsonObject;

public record ExchangeRateResponse(String base_code, JsonObject conversion_rates) {
}
