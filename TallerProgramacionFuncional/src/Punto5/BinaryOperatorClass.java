package Punto5;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class BinaryOperatorClass {
    public static void main(String[] args) {

        BinaryOperator<BigDecimal> division = (x,y) -> {
           if(y.equals(BigDecimal.ZERO)){
               throw  new ArithmeticException("División por cero no permitida");
           }
           return x.divide(y, BigDecimal.ROUND_HALF_UP);
        };

        BigDecimal num1 = new BigDecimal("10.5");
        BigDecimal num2 = new BigDecimal("2.5");

        BigDecimal resultado = division.apply(num1, num2);
        System.out.println("Resultado de la división: " + resultado);
    }
}
