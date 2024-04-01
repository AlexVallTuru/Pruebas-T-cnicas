import java.util.Arrays;
import java.util.List;

public class ejercicio7 {

    public static void main(String[] arg) {

        List<Integer> listaNumeros = Arrays.asList(4, 2, 3, 1, 7, 0);
        listaNumeros.sort(null);
        System.out.println(permutacionNumFinal(listaNumeros));
    }

    public static int permutacionNumFinal(List<Integer> listaNumeros) {
        int numeroPermutacion = listaNumeros.get(0);
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (numeroPermutacion != listaNumeros.get(i)) {
                return numeroPermutacion;
            }
            numeroPermutacion++;
        }
        System.out.println("Esta vez, no ha funcionado");
        return listaNumeros.get(listaNumeros.size() - 1);
    }
}
