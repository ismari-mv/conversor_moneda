package com.ismarimurrieta.conversormonedas.modelos;

import java.util.Map;

public class ConvertirMoneda {
    public static double Convertir(double monto, String base_code, Map<String, Double> conversion_rates) {
        // Obtener la tasa de cambio de la moneda base
        Double tasaCambio = conversion_rates.get(base_code);

        // Verificar que la tasa de cambio exista en el mapa
        if (tasaCambio != null) {
            // Calcular el monto convertido
            double montoConvertido = monto * tasaCambio;
            return montoConvertido;
        } else {
            // Si no se encuentra la tasa de cambio, lanzar una excepción o manejar el error
            throw new IllegalArgumentException("La tasa de cambio para " + base_code + " no se encuentra disponible.");
        }
    }
}
