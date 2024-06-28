public class ejercicio26 {

    public static void main(String[] args) {

        System.out.println(esSocio(15));
        System.out.println(10 * 15);

    }

    public static double esSocio(int numVeces) {

        final double preuSoci = 8.2;
        final double suplementPreuSoci = 90;

        double totalPagar = 0;

        if (numVeces > 1) {
            totalPagar = preuSoci;

            double tmp = totalPagar;

            for (int i = 1; i < numVeces-1; i++) {
                if (!(Math.pow(0.78, i) <= 0.50)) {
                    tmp = (tmp * 78 / 100);
                    totalPagar = totalPagar + tmp;
                } else {
                    tmp = (preuSoci * 50 / 100);
                    totalPagar = totalPagar + tmp;
                }
            }
            return totalPagar + suplementPreuSoci;
        }else {
            return 0;
        }

    }

}
