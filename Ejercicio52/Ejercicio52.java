//package Ejercicio52;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio52 {

    public static void main(String[] args) {

        int[][] numeros = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        //List<Integer> resultadoList = limpiarNumeros(numeros);
        int[] resultadoArray = limpiarNumeros(numeros);


    }

    public static int[] limpiarNumeros(int[][] numeros) {

        /*List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                listaNumeros.add(numeros[i][j]);
            }
        }*/

        int longitudArray = 0;

        for(int i = 0; i < numeros.length; i++){
            longitudArray = longitudArray + numeros[i].length;
        }

        int[] numerosArray = new int[longitudArray];

        int contadorNumeros = 0;

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[i].length; j++){
                numerosArray[contadorNumeros++] = numeros[i][j];
            }
        }
        for(int numero:numerosArray){
            System.out.println(numero);
        }

        return numerosArray;
    }
}
