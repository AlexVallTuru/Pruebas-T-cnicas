import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio25 {

    public static void main(String[] args) {

        List<String> archivos = new ArrayList<>(Arrays.asList("Imagen.png", "Imagen.png", "curriculum.png",
                "curriculum.png", "curriculum.png", "curriculum.jpg", "curriculum.jpg"));

        renombrarArchivos(archivos);

    }

    public static void renombrarArchivos(List<String> archivos) {

        List<String> archivosModificados = new ArrayList<>(archivos);

        for (int i = 0; i < archivos.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < archivos.size(); j++) {
                if (archivosModificados.get(i).equalsIgnoreCase(archivos.get(j)) && j != i) {
                    String archivosMod = archivos.get(j);
                    // archivosMod = archivosMod +"("+ count +")";
                    if (archivosMod.contains(".")) {
                        String[] parts = archivosMod.split("\\.");
                        archivosMod = parts[0].concat("(" + count + ").").concat(parts[1]);
                    } else {
                        throw new IllegalArgumentException("String " + archivosMod + " no contiene extension visible");
                    }
                    archivosModificados.remove(j);
                    archivosModificados.add(j, archivosMod);
                    count++;
                }
            }
        }
        for (String archivo : archivosModificados) {
            System.out.println(archivo);
        }
    }
}
