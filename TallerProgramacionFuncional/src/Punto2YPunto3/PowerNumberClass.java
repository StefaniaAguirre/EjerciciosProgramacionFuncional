package Punto2YPunto3;

import java.util.function.Function;
import java.util.function.Predicate;

public class PowerNumberClass {

    public static void main(String[] args) {

        Function<PowerRequest, Double>  square = num ->  Math.pow(num.getBase(), num.getExponent());

        PowerRequest num = new PowerRequest(8,4);
        PowerRequest num2 = new PowerRequest(2,3);
        PowerRequest num3 = new PowerRequest(3,9);

        Predicate<Double> isEven = value -> value % 2 == 0;

        num.setResult(square.apply(num));
        num2.setResult(square.apply(num2));
        num3.setResult(square.apply(num3));

        System.out.println("Potencia de "+ num.getBase() + " a la " + num.getExponent() + " es: "+ num.getResult() + " el resultado es un numero par : " +  isEven.test(num.getResult()));
        System.out.println("Potencia de "+ num2.getBase() + " a la " + num2.getExponent() + " es: "+num2.getResult()+ " el resultado es un numero par : " +  isEven.test(num2.getResult()));
        System.out.println("Potencia de "+ num3.getBase() + " a la " + num3.getExponent() + " es: "+num3.getResult()+ " el resultado es un numero par : " +  isEven.test(num3.getResult()));

    }
}
