import java.util.ArrayList;

public class ejercicio2 {
    public static void main(String[] args) {

        String cadena = eliminarPartsInecesariasRuta("/Hola Mundo/../../../Hola Mundo//Me llamo Carl/../.././x/y/z/");
        cadena = eliminarContrabarraFinal(cadena);
        cadena = subidaNivelDirectoerios(cadena);
        System.out.println(cadena);
    }

    public static String eliminarContrabarraFinal(String cadena) {
        if (cadena.endsWith("/")) {
            cadena = cadena.substring(0, cadena.length() - 1);
        }
        return cadena;
    }

    public static String eliminarPartsInecesariasRuta(String cadena) {

        if (cadena.contains("//")) {
            cadena = cadena.replace("//", "/");
        }
        if (cadena.contains("/./")) {
            cadena = cadena.replace("/./", "/");
        }
        return cadena;
    }

    public static String subidaNivelDirectoerios(String cadena) {
        String[] nivelSuperior = cadena.split("/");
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < nivelSuperior.length; i++) {
            if (!nivelSuperior[i].equals("..")) {
                resultado.add(nivelSuperior[i]);
            } else {
                if (!resultado.isEmpty()) {
                    resultado.remove(resultado.size() - 1);
                }
            }
        }

        StringBuilder cadenaResultado = new StringBuilder();
        for (int i = 0; i < resultado.size(); i++) {
            if (i > 0) {
                cadenaResultado.append("/");
            }
            cadenaResultado.append(resultado.get(i));
        }
        cadenaResultado.insert(0, "/");

        return cadenaResultado.toString();
    }
}
