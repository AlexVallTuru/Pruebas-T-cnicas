import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio4 {

    public static void main(String[] args) {

        juegoDelAhorcado("victor");
    }

    public static void juegoDelAhorcado(String palabra) {
        int vidas = 5;
        ArrayList<String> palabraPorPartes = nombrePorPartes(palabra);
        String nombreMostrarPorPantalla = nombreMostrar(palabraPorPartes);
        ArrayList<String> palabraPorPartesMostrar = nombrePorPartes(nombreMostrarPorPantalla);
        System.out.print("Adivina la palabra: " + nombreMostrarPorPantalla);
        while (nombreMostrarPorPantalla.contains("-")) {
            int previoMostrar = contarGuiones(nombreMostrarPorPantalla);
            nombreMostrarPorPantalla = destaparDigito(palabraPorPartesMostrar, palabraPorPartes, vidas);
            int despuesMostrar = contarGuiones(nombreMostrarPorPantalla);
            if (previoMostrar == despuesMostrar) {
                vidas = vidas - 1;
                System.out.print("Has perdido una vida, te quedan: " + vidas + " vidas");
                if (vidas == 0) {
                    System.out.println("\nFin del juego, no te quedan vidas!");
                    return;
                }
            }
            System.out.print("\nAdivina la palabra: " + nombreMostrarPorPantalla);
        }
        if (!nombreMostrarPorPantalla.contains("-")) {
            System.out.print("\n¡Felicidades, has ganado!\nLa palabra era: " + palabra);
            return;
        }
    }

    public static int contarGuiones(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '-') {
                contador++;
            }
        }
        return contador;
    }

    public static String destaparDigito(ArrayList<String> palabraPorPartesMostrar, ArrayList<String> palabraPorPartes,
            int vidas) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("\nIntroduce un carácter: ");
            String caracter = in.nextLine();
            if (palabraPorPartes.contains(caracter)) {
                for (int i = 0; i < palabraPorPartes.size(); i++) {
                    if (palabraPorPartes.get(i).contains(caracter)) {
                        palabraPorPartesMostrar.set(i, caracter);
                    }
                }
            }
        }

        String nombreCompuesto = "";
        for (String digito : palabraPorPartesMostrar) {
            nombreCompuesto = nombreCompuesto + digito;
        }

        return nombreCompuesto;
    }

    public static ArrayList<String> nombrePorPartes(String palabra) {
        ArrayList<String> palabraPorPartes = new ArrayList<>();
        for (int i = 0; i < palabra.length(); i++) {
            palabraPorPartes.add(String.valueOf(palabra.charAt(i)));
        }
        return palabraPorPartes;
    }

    public static String nombreMostrar(ArrayList<String> palabraPorPartes) {

        int numeroRandom = ThreadLocalRandom.current().nextInt(0, palabraPorPartes.size());
        String nombreMostrar = "";
        for (int i = 0; i < palabraPorPartes.size(); i++) {
            if (i != numeroRandom) {
                nombreMostrar = nombreMostrar + "-";
            } else {
                nombreMostrar = nombreMostrar + palabraPorPartes.get(i);
            }
        }
        return nombreMostrar;
    }

}
