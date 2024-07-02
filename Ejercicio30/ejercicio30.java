import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio30 {

    public static void main(String[] args) {

        List<Integer> listaNums = new ArrayList<>(Arrays.asList(4, 4, 4, 2, 2, 2, 2, 3));
        System.out.println(eliminarDuplicados(listaNums));

    }

    public static int eliminarDuplicados(List<Integer> numeros) {

        List<Integer> sinDuplicados = new ArrayList<>(numeros);
        int longitud = 0;
        for (int i = 0; i < sinDuplicados.size(); i++) {
            int contadorRepetidos = 0;
            for (int j = 0; j < sinDuplicados.size(); j++) {
                if (sinDuplicados.get(i).equals(sinDuplicados.get(j))) {
                    contadorRepetidos++;
                    if (contadorRepetidos > 2) {
                        sinDuplicados.remove(j);
                        j--;
                    }
                }
            }
        }
        System.out.println(sinDuplicados);
        longitud = sinDuplicados.size();
        return longitud;
    }
}
