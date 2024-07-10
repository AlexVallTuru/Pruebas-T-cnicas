
public class ejercicio40 {

    public static void main(String[] args) {
        romanoAEntero("CDXIV");
    }

    public static void romanoAEntero(String numeroRomano) {

        String[] simbolosRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] valoresDecimales = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] simbolosCompuestos = { "CM", "CD", "XC", "XL", "IX", "IV" };
        int numeroDecimal = 0;
        for (String sibolo : simbolosCompuestos) {
            if (numeroRomano.contains(sibolo)) {
                numeroRomano = numeroRomano.replace(sibolo, "");
                for (int i = 0; i < simbolosRomanos.length; i++) {
                    if (simbolosRomanos[i].equals(sibolo)) {
                        numeroDecimal = numeroDecimal + valoresDecimales[i];
                    }
                }
            }
        }
        char[] nuermoRomanoSeparado = numeroRomano.toCharArray();
        for (int i = 0; i < nuermoRomanoSeparado.length; i++) {

            String letraIzquierda = Character.toString(nuermoRomanoSeparado[i]);
            int posicionNum = -1;
            for (int j = 0; j < simbolosRomanos.length; j++) {
                if (letraIzquierda.equals(simbolosRomanos[j])) {
                    posicionNum = j;
                }
            }
            if (posicionNum != -1) {
                numeroDecimal = numeroDecimal + valoresDecimales[posicionNum];
            }
        }
        System.out.println(numeroDecimal);
    }

}
