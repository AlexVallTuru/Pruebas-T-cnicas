//package Ejercicio51;

public class ejercicio51 {

    public static void main(String[] args) {

        generarDiamante(5);

    }

    public static void generarDiamante(int tamanio) {

        int cantidadEspacios = 0;
        // El numero 3 es el minimo para hacer la piramide mas pequeña
        if (!(tamanio < 3)) {
            if (parImpar(tamanio).equals("par")) {
                tamanio = tamanio - 1;
                cantidadEspacios = (tamanio - 1) / 2;
            } else {
                cantidadEspacios = (tamanio - 1) / 2;
            }
            espaciosEstrellasParteSuperior(cantidadEspacios);
            estrellasParteCentral(tamanio);
            espaciosEstrellasParteInferior(cantidadEspacios, tamanio);

        } else {
            System.out.println("No se puede crear un diamante con longitud de 2 o inferior....");
        }

    }

    public static void espaciosEstrellasParteSuperior(int cantidadEspacios) {
        StringBuilder espaciosEstrellas = new StringBuilder();
        int contadorEstrellas = 0;
        for (int i = cantidadEspacios; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                espaciosEstrellas.append(" ");
            }
            contadorEstrellas = contadorEstrellasImpares(contadorEstrellas, "superior");
            for (int j = 0; j < contadorEstrellas; j++) {
                espaciosEstrellas.append("*");
            }
            System.out.print(espaciosEstrellas + "\n");
            espaciosEstrellas.setLength(0);
        }
    }

    public static void espaciosEstrellasParteInferior(int cantidadEspacios, int tamanio) {
        int contadorEstrellas = tamanio;
        StringBuilder espaciosEstrellas = new StringBuilder();
        for (int l = 0; l < cantidadEspacios; l++) {
            for (int p = 0; p < l+1; p++) {
                espaciosEstrellas.append(" ");
            }
            contadorEstrellas = contadorEstrellasImpares(contadorEstrellas, "inferior");
            for (int j = 0; j < contadorEstrellas; j++) {
                espaciosEstrellas.append("*");
            }
            System.out.print(espaciosEstrellas + "\n");
            espaciosEstrellas.setLength(0);
        }

    }

    public static void estrellasParteCentral(int tamanio) {
        StringBuilder estrellas = new StringBuilder();
        for (int i = 0; i < tamanio; i++) {
            estrellas.append("*");
        }
        System.out.println(estrellas);
    }

    public static String parImpar(int tamanio) {

        if (tamanio % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }

    }

    public static int contadorEstrellasImpares(int estrellas, String superiorInferior) {
        int contEstellas = estrellas;
        if (superiorInferior.equals("superior")) {
            if (estrellas == 0) {
                return 1;
            } else if (estrellas % 2 != 0) {
                return contEstellas + 2;
            }
            return contEstellas;
        } else {
            if (estrellas <= 1) {
                return 1;
            } else if (estrellas % 2 != 0) {
                return contEstellas + -2;
            }
            return contEstellas;
        }
    }
}
