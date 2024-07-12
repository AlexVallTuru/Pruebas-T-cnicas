//package Ejercicio44;

import java.util.List;

public class ejercicio44 {

    public static void main(String[] args) {
        
        esPangrama("El pequeño jabato erizo se balanceaba sobre la rama del árbol."); // true
        esPangrama("Hola soy Víctor Robles"); // false

    }

    public static boolean esPangrama(String frase){

        List<String> listaPangrama = List.of("A","E","I", "O", "U");

        //listaPangrama.forEach(vocal -> System.out.println(vocal));
        System.out.println(listaPangrama.stream().allMatch(vocal -> frase.toUpperCase().contains(vocal)));
        return listaPangrama.stream().allMatch(vocal -> frase.contains(vocal));
    }

}
