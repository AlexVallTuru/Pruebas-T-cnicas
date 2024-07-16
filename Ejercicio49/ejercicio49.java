//package Ejercicio49;

import java.util.List;

public class ejercicio49 {

    public static void main(String[] args) {

        List<Integer> listaNumeros = List.of(8, 9, 99, 88, 77, 1, 12, 13, 6, 7);
        elMasPequenio(listaNumeros);

    }

    public static void elMasPequenio(List<Integer> listaNumeros) {

        int numeroMasPequenio = -1;

        for (int numero : listaNumeros) {
            if (numeroMasPequenio != -1) {

                if (numero < numeroMasPequenio) {
                    numeroMasPequenio = numero;
                }
            } else {
                numeroMasPequenio = numero;
            }
        }
        System.out.println(numeroMasPequenio);

    }

}
