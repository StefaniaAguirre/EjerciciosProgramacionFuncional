package Punto2YPunto3;

public class PowerRequest {
    private double base;
    private double exponent;
    private  double result;

    public PowerRequest(double base, double exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getExponent() {
        return exponent;
    }

    public void setExponent(double exponent) {
        this.exponent = exponent;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}


