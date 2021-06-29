import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gudimenko Oltg
 * @see Calculator в классе реализованна работа калькулятора
 */


public class Calculator {
    private double a;
    private double b;

    public Calculator() {

    }

    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }


    public double sum() {
        return a + b;
    }

     public double subtraction() {
        return a - b;
    }

     public double multiplication() {
        return a * b;
    }

     public double division() {
        return a / b;
    }

}
