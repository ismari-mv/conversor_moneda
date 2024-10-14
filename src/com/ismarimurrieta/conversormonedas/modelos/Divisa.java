package com.ismarimurrieta.conversormonedas.modelos;

import java.util.Map;

public class Divisa {
    private String time_last_update_utc;
    private String time_next_update_utc;
    private String base_code;
    private Map<String, Double> conversion_rates;

    // Getter para las tasas de cambio
    public Map<String, Double> getTasas() {
        return conversion_rates;
    }

    // Getter para la divisa base
    public String getBaseCode() {
        return base_code;
    }
}


