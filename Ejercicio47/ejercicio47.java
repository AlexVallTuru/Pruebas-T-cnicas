//package Ejercicio47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio47 {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> lista = new ArrayList<ArrayList<String>>();

        lista.addAll(Arrays.asList(
                new ArrayList<>(Arrays.asList("PIEDRA", "TIJERA")),
                new ArrayList<>(Arrays.asList("TIJERA", "PAPEL")),
                new ArrayList<>(Arrays.asList("PAPEL", "PIEDRA"))));

        quienGana(lista);
        lista.clear();
    }

    private static void quienGana(ArrayList<ArrayList<String>> lista) {

        int resultadosPlayer1 = 0;
        int resultadosPlayer2 = 0;

        for (ArrayList<String> subList : lista) {

            if (!subList.get(0).equals(subList.get(1))) {
                if (subList.get(0).equals("PIEDRA") && (subList.get(1).equals("TIJERA"))) {
                    // PIEDRA GANA TIJERA
                    resultadosPlayer1++;
                } else if (subList.get(0).equals("TIJERA") && (subList.get(1).equals("PAPEL"))) {
                    // TIJERA GANA PAPEL
                    resultadosPlayer1++;
                } else if (subList.get(0).equals("PAPEL") && (subList.get(1).equals("PIEDRA"))) {
                    // PAPEL GANA PIEDRA
                    resultadosPlayer1++;
                } else {
                    resultadosPlayer2++;
                }
            }
        }

        if (resultadosPlayer1 > resultadosPlayer2) {
            System.out.println("Ganador jugador 1");
        } else if (resultadosPlayer2 > resultadosPlayer1) {
            System.out.println("Ganador jugador 2");
        } else {
            System.out.println("Empate tecnico");
        }

    }

}
