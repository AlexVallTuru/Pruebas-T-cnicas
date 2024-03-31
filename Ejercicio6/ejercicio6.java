package Ejercicio6;

import java.time.Year;

public class ejercicio6 {
    public static void main(String[] arg) {

        int yearNow = Year.now().getValue();
        int year = yearNow;
        for (int i = year; i < yearNow + 30; i++) {
            if (calcularBisiesto(year)) {
                System.out.println(year);
            }
            year++;
        }
    }

    public static Boolean calcularBisiesto(int anio) {
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}