import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Ejercicio11 {

    @SuppressWarnings("unchecked")
    public static void main(String[] arg) {

        ArrayList<Object> sumaDos = new ArrayList<>();
        sumaDos.add(Arrays.asList(3, 7, 8, 2));
        sumaDos.add(10);

        ArrayList<int[]> combinaciones = new ArrayList<>();

        for (int i = 0; i < ((List<?>) sumaDos.get(0)).size(); i++) {
            System.out.print(((List<?>) sumaDos.get(0)).get(i) + " ");

            for (int j = i + 1; j < ((List<?>) sumaDos.get(0)).size(); j++) {
                if (((List<Integer>) sumaDos.get(0)).get(i) + ((List<Integer>) sumaDos.get(0)).get(j) == (int) sumaDos.get(1)) {
                    combinaciones.add(new int[] { ((List<Integer>) sumaDos.get(0)).get(i),
                            ((List<Integer>) sumaDos.get(0)).get(j) });
                }
            }

        }
        for (int[] combinacion : combinaciones) {
            System.out.print(Arrays.toString(combinacion));
        }
    }
}
