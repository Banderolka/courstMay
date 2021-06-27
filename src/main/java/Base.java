import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gudimenko Oltg
 * @see #main(String[]) в методе разводящаая точка между Calculator и ArrayString
 * @see Calculator в классе реализованна работа калькулятора
 * @see ArrayString в классе реализована работа с массивом
 *
 */
public class Base extends ReadClass {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        ArrayString arrayString = new ArrayString();
        System.out.println("Выберите:\n1 - выполнить вычисления на калькуляторе \n2 - работа с массивом");
        int number  = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(reader.readLine());
        if (number == 1) calculator.selectOperation();
        else if (number == 2) arrayString.sizeArray();

    }
}





