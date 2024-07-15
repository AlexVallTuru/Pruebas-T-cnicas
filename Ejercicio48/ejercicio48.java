//package Ejercicio48;

import java.util.ArrayList;
import java.util.List;

public class ejercicio48 {

    public static void main(String[] args) {

        List<Integer> listadoNumeros = List.of(1, 2, 3, 4);

        for (Integer integer : listadoNumeros) {

        }
        elevaMitad(listadoNumeros).forEach(System.out::println);

    }

    public static List<Double> elevaMitad(List<Integer> listadoNumeros) {
        
        double numeroCalculado = 0;
        List<Double> calculados = new ArrayList<>();

        for (double numero : listadoNumeros) {

            numeroCalculado = Math.pow(numero, 3) / 2;
            calculados.add(numeroCalculado);
        }
        return calculados;
    }

}