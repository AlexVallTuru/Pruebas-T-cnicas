package Ejercicio8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] arg) {

        String[] simbolosRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] valoresDecimales = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero a que quieras transformar en numeros romanos:");

        int numero = Integer.parseInt(in.nextLine());
        String resultadoFinal = "";

        for (int i = 0; i < valoresDecimales.length; i++) {
            while (numero >= valoresDecimales[i]) {
                resultadoFinal += simbolosRomanos[i];
                numero -= valoresDecimales[i];
            }
        }
        System.out.print(resultadoFinal);
    }
}
