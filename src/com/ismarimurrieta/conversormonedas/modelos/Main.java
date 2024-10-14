package com.ismarimurrieta.conversormonedas.modelos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido a la herramienta de cambio en tiempo real");

        System.out.println("*******************************************************");

        Map <String, Double> tasasCambio = null;
        int salirApp = 2;
        while (salirApp !=0 ) {
            if (salirApp == 2){
                System.out.println("Ingrese el tipo de moneda: ");
                String moneda = lectura.nextLine();
                tasasCambio = OpcionMonedas.opcion(moneda);
            }
            if (tasasCambio!= null) {
                System.out.println("Ingrese el monto: ");
                double monto = lectura.nextDouble();
                lectura.nextLine();

                System.out.println("Ingrese la moneda destino: ");
                String moneda2 = lectura.nextLine();

                System.out.println("El resultado de la conversión es: "+ ConvertirMoneda.Convertir(monto,moneda2,tasasCambio) + moneda2);
                System.out.println("¿Deseas hacer otra conversión? ingrese 0 para salir, 1 para seguir con la misma moneda y 2 para continuar ");
                salirApp = lectura.nextInt();
                lectura.nextLine();

            }
        }

    }

}

