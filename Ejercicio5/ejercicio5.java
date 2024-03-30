import java.util.ArrayList;
import java.util.Arrays;

public class ejercicio5 {

    public static void main(String[] arg) {
        String nombres[] = { "Víctor Robles", "Antonio Alcantara", "Al Pacino",
                "Robert DeNiro", "Brad Pitt", "Sylvester Stallone" };
        ArrayList<String> nombresLista = new ArrayList<>(Arrays.asList(nombres));
        ArrayList<String> ordenarPorApellidos = new ArrayList<>();
        ArrayList<String> nombresCompletosApellidosOrdenados = new ArrayList<>();
        for (int i = 0; i < nombresLista.size(); i++) {
            String nombresApellidos[] = nombresLista.get(i).split(" ");
            ordenarPorApellidos.add(nombresApellidos[1]);
            ordenarPorApellidos.sort(null);
        }
        for (String apellido : ordenarPorApellidos) {
            for (String nombreCompleto : nombresLista) {
                if (nombreCompleto.contains(apellido)) {
                    nombresCompletosApellidosOrdenados.add(nombreCompleto);
                    System.out.println(nombreCompleto);
                }
            }
        }
    }
}