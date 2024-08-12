package Punto7;

import sun.applet.Main;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class DateClass {

    public static void main(String[] args) {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2023, 1, 17),
                LocalDate.of(2024, 6, 20),
                LocalDate.of(2025, 11, 1)
        );

        dates.forEach(date -> showDateFormatted(date));
    }

    public static void showDateFormatted(LocalDate date){
        int dia = date.getDayOfMonth();
        String mes = getMonthName(date.getMonthValue());
        int anio = date.getYear();
        System.out.println("La fecha es " + dia + " de " + mes + " del " + anio + ".");

    }

    public static String getMonthName(int month) {
        String[] months = {
                "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };
        return months[month - 1];
    }


}
