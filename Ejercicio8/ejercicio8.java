package Ejercicio8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] arg) {
        Map<String, Integer> numerosRumanos = new HashMap<String, Integer>();

        numerosRumanos.put("M", 1000);
        numerosRumanos.put("CM", 900);
        numerosRumanos.put("D", 500);
        numerosRumanos.put("CD", 400);
        numerosRumanos.put("C", 100);
        numerosRumanos.put("XC", 90);
        numerosRumanos.put("L", 50);
        numerosRumanos.put("XL", 40);
        numerosRumanos.put("X", 10);
        numerosRumanos.put("IX", 9);
        numerosRumanos.put("V", 5);
        numerosRumanos.put("IV", 4);
        numerosRumanos.put("I", 1);

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un numero a que quieras transformar en numeros romanos:");

        try {

            int numeroDecimal = in.nextInt();

        } catch (Exception e) {
            System.out.println("Por favor introduce un número únicamente...");
        }

    }
}
