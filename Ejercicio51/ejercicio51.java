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
            espaciosParteSuperior(cantidadEspacios);

            // MEDIO
            System.out.println("Estamos al medio");
            // PARTE INFERIOR
            espaciosParteInferior(cantidadEspacios);

        } else {
            System.out.println("No se puede crear un diamante con longitud de 2 o inferior....");
        }

    }

    public static void espaciosParteSuperior(int cantidadEspacios) {
        StringBuilder espacios = new StringBuilder();
        // PARTE SUPERIOR
        for (int i = cantidadEspacios; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                espacios.append("-");
            }
            System.out.print(espacios + "\n");
            espacios.setLength(0);
        }
    }

    public static void espaciosParteInferior(int cantidadEspacios) {
        StringBuilder espacios = new StringBuilder();
        for (int l = 0; l < cantidadEspacios; l++) {
            espacios.append("-");
            System.out.print(espacios + "\n");
        }
    }

    public static String parImpar(int tamanio) {

        if (tamanio % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }

    }

}
