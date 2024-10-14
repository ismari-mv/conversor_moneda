package com.ismarimurrieta.conversormonedas.modelos;
import java.util.Map;

public class OpcionMonedas {
    public static Map<String, Double> opcion (String moneda) {
        ConsultaDivisa consultaDivisa = new ConsultaDivisa();
        // Obtener las tasas de cambio desde la API (en este caso, desde USD como base)
        Divisa divisa = consultaDivisa.tasasDeCambio(moneda);

        if (divisa != null && divisa.getTasas() != null){
            // Mostrar opciones de moneda destino usando las tasas obtenidas
            mostrarOpcionesMoneda("destino", divisa.getTasas());
            return divisa.getTasas();
        } else {
            System.out.println("Error al obtener las tasas de cambio. Por favor ingrese una moneda origen válida");
            return  null;
        }
    }

    // Mostrar opciones de moneda
    public static void mostrarOpcionesMoneda(String tipo, Map<String, Double> tasas)
    {
        int i = 1;
        System.out.println("A continuación se muestra la lista de las conversiones disponibles: ");
        for (Map.Entry<String, Double> entrada : tasas.entrySet()) {
            System.out.println(i + ") " + entrada.getKey());
            i++;
        }

    }
}

