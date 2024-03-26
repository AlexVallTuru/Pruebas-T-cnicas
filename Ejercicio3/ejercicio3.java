
// diferenciaDeDias('Dec 1, 2023', 'Dec 24, 2023'); // Salida: 23

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ejercicio3 {
    public static void main(String[] arg) {

        System.out.print(diferenciaDeDias("Dec 1, 2023", "Dec 24, 2023"));

    }

    public static int diferenciaDeDias(String fecha1, String fecha2) {

        ArrayList<String> fecha1Separada = new ArrayList<>(Arrays.asList(fecha1.split(" ")));
        ArrayList<String> fecha2Separada = new ArrayList<>(Arrays.asList(fecha2.split(" ")));

        String fechaFormatada1 = FormateadorDeFechas(fecha1Separada);
        String fechaFormatada2 = FormateadorDeFechas(fecha2Separada);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date firstDate = null;
        Date secondDate = null;
        try {
            firstDate = sdf.parse(fechaFormatada1);
            secondDate = sdf.parse(fechaFormatada2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Obtenemos la fehca en milisegundos (siempre en positivo abs)
        long diferenciaEnMilisegundos = Math.abs(firstDate.getTime() - secondDate.getTime());
        // Realizamos el calculo para obtener los dias que son
        // int diasDeDiferencia = (int) (diferenciaEnMilisegundos / (1000 * 60 * 60 *
        // 24));
        long diasDeDiferencia = TimeUnit.MILLISECONDS.toDays(diferenciaEnMilisegundos);

        return (int) diasDeDiferencia;
    }

    public static String FormateadorDeFechas(ArrayList<String> fechaSeparada) {

        String mes = fechaSeparada.get(0);
        mes = obtenerMesDiccionario(mes);
        String dia = fechaSeparada.get(1);
        dia = limpiarDiaDelMes(dia);
        String anyo = fechaSeparada.get(2);

        // MM/dd/yyy
        String fechaFormatada = dia + "/" + mes + "/" + anyo;
        return fechaFormatada;
    }

    public static String obtenerMesDiccionario(String mesEnTexto) {

        Map<String, String> meses = new HashMap<>();

        meses.put("Jan", "01");
        meses.put("Feb", "02");
        meses.put("Mar", "03");
        meses.put("Apr", "04");
        meses.put("May", "05");
        meses.put("Jun", "06");
        meses.put("Jul", "07");
        meses.put("Aug", "08");
        meses.put("Sep", "09");
        meses.put("Oct", "10");
        meses.put("Nov", "11");
        meses.put("Dec", "12");

        return meses.get(mesEnTexto);
    }

    public static String limpiarDiaDelMes(String diaMes) {
        if (diaMes.endsWith(",")) {
            diaMes = diaMes.substring(0, diaMes.length() - 1);
        }
        int dia = Integer.parseInt(diaMes);

        if (dia < 10) {
            diaMes = "0" + diaMes;
        }

        return diaMes;
    }

}