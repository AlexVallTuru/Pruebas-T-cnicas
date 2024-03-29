import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ejercicio5 {

    public static void main(String arg[]) {
        String nombres[] = { "Víctor Robles", "Antonio Alcantara", "Al Pacino",
                "Robert DeNiro", "Brad Pitt", "Sylvester Stallone" };
        ArrayList<String> nombresLista = new ArrayList<>(Arrays.asList(nombres));
        ArrayList<String> ordenarPorApellidos = new ArrayList<>();
        for (int i = 0; i < nombresLista.size(); i++) {
            ordenarPorApellidos.add(nombresLista.get(i).split(" "));
        }

    }
}