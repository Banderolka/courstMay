package calcu;

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
        double c = 0;

        try {
            if (b == 0) throw  new  ArithmeticException();
           c = a / b;

        }catch (ArithmeticException e){
            System.out.println("Делить на ноль нельзя");
            System.exit(0);
         }
        return c;
     }

}
