import java.util.ArrayList;
import java.util.List;

public class ejercicio39 {

    public static void main(String[] args) {
        List<String> combinaciones = combinacionesParentesis(1);
        for (String combinacion : combinaciones) {
            System.out.println(combinacion);
        }
    }

    public static List<String> combinacionesParentesis(int combinacions) {
        List<String> result = new ArrayList<>();
        generarCombinaciones(result, "", 0, 0, combinacions);
        return result;
    }

    private static void generarCombinaciones(List<String> result, String current, int open, int close, int max) {
        // Si la longitud de la cadena actual es el doble de max, añadir al resultado
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        // Si el número de paréntesis abiertos es menor que max, agregar '(' y continuar
        if (open < max) {
            generarCombinaciones(result, current + "(", open + 1, close, max);
        }

        // Si el número de paréntesis cerrados es menor que el de abiertos, agregar ')' y continuar
        if (close < open) {
            generarCombinaciones(result, current + ")", open, close + 1, max);
        }
    }
}
