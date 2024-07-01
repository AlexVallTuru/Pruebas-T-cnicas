
public class ejercicio28 {

    public static void main(String[] args) {

        esAmstrong(371);

    }

    public static boolean esAmstrong(int numero) {

        String numConvertir = Integer.toString(numero);
        char[] numIndependientes = numConvertir.toCharArray();
        double nueroElevar = numIndependientes.length;
        double numFinal = 0;

        for (char num : numIndependientes) {

            double numeroChar = Character.getNumericValue(num);

            numFinal = numFinal + Math.pow(numeroChar, nueroElevar);

        }

        if (numFinal == numero) {
            System.out.println("El numero " + numero + " es amstrong.");
        } else {
            System.out.println("No es amstrong.");
        }

        return true;
    }

}
