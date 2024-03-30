import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio5Optimizado {

    public static void main(String[] arg) {
        String[] nombres = { "Victor Robles", "Antonio Alcantara", "Al Pacino",
                "Robert DeNiro", "Brad Pitt", "Sylvester Stallone" };
        ArrayList<String> nombresLista = new ArrayList<>(Arrays.asList(nombres));

        nombresLista.sort((string1, string2) -> {
            String apellido1 = string1.substring(string1.indexOf(" ") + 1);
            String apellido2 = string2.substring(string2.indexOf(" ") + 1);
            return apellido1.compareTo(apellido2);
        });

        for (String nombre : nombresLista) {
            System.out.println(nombre);
        }
    }
}
