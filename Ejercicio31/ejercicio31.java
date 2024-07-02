
public class ejercicio31 {

    public static void main(String[] args) {

        invertirPalabras("Hi Hello World!");

    }

    public static void invertirPalabras(String frase) {

        char[] frasePartesOrdenadas = frase.toCharArray();
        char[] frasePartesInvertidas = new char[frasePartesOrdenadas.length];
        int contador = 0;
        int end = frasePartesOrdenadas.length;

        for (int i = frasePartesOrdenadas.length - 1; i >= 0; i--) {

            if (frasePartesOrdenadas[i] == ' ' || i == 0) {

                // int start = (i == 0) ? i : i + 1;
                int start;
                if (i == 0) {
                    start = i;
                } else {
                    start = i + 1;
                }

                for (int j = start; j < end; j++) {
                    frasePartesInvertidas[contador] = frasePartesOrdenadas[j];
                    contador++;
                }
                if (i != 0) {
                    frasePartesInvertidas[contador] = ' ';
                    contador++;
                }

                end = i;
            }
        }

        System.out.println(frasePartesInvertidas);

    }

}
