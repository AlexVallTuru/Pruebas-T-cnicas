import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ejercicio24 {

    public static void main(String[] args) {

        List<String> archivos = new ArrayList<>(Arrays.asList("Hola", "Me", "Hola", "Karl","hola","Me","Me","Karl"));

        renombrarArchivos(archivos);

    }

    public static void renombrarArchivos(List<String> archivos) {

        List<String> archivosModificados = new ArrayList<>(archivos);

        for (int i = 0; i < archivos.size(); i++) {
            int count = 1;
            for (int j = i+1; j < archivos.size(); j++) {
                if (archivosModificados.get(i).equalsIgnoreCase(archivos.get(j)) && j != i) {
                    String archivosMod = archivos.get(j);
                    archivosMod = archivosMod +"("+ count +")";
                    archivosModificados.remove(j);
                    archivosModificados.add(j, archivosMod);
                    count ++;
                }
            }
        }
        for (String archivo : archivosModificados) {
            System.out.println(archivo);
        }
    }
}
