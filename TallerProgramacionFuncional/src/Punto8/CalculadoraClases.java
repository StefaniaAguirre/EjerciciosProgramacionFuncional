package Punto8;

public class CalculadoraClases {

    private double acumulado;

    public CalculadoraClases(double acumulado) {
        this.acumulado = acumulado;
    }

    public static void main(String[] args) {
        CalculadoraClases calculadora = new CalculadoraClases(0);
        calculadora.sumar(18).multiplicar(3).restar(2);
    }

    public CalculadoraClases sumar(double valor){
        this.acumulado += valor;
        System.out.println("Valor del acumulado en la suma: " + this.acumulado);
        return this;
    }

    public CalculadoraClases restar(double valor){
        this.acumulado -= valor;
        System.out.println("Valor del acumulado en la resta:  " + this.acumulado);
        return this;
    }

    public CalculadoraClases multiplicar(double valor){
        this.acumulado *= valor;
        System.out.println("Valor del acumulado en la multiplicación: " + this.acumulado);
        return this;
    }

}
