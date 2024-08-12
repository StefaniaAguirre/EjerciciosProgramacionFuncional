package Punto6;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

public class PersonValidator {

    @FunctionalInterface
    interface Person{
        String validar(String name, int age, LocalDate dateOfBirth);
    }

    public static void main(String[] args) {
        BiFunction<LocalDate, Integer, Boolean> isValidAge = (dateOfBirth, age) -> {
            return Period.between(dateOfBirth, LocalDate.now()).getYears() == age;
        };

        Person person = ((name, age, dateOfBirth) -> {
            boolean isValid = isValidAge.apply(dateOfBirth, age);
            if (isValid){
                return "La fecha de nacimiento de " + name + " corresponde a la edad ingresada.";
            } else {
                return "La fecha de nacimiento de " + name + " no corresponde a la edad ingresada.";
            }
        });

        String nombre = "Andres";
        int edad = 27;
        LocalDate fechaNacimiento = LocalDate.of(1999, 8, 10);

        String resultado = person.validar(nombre, edad, fechaNacimiento);
        System.out.println(resultado);
    }

}
