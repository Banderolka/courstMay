import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gudimenko Oltg
 * @see #main(String[]) пока вся логика расположена в этом методе. В методе считывкбтся с клавиатуры и складываются два double
 *
 */
public class Calculator {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите первое слагаемое");
            a = Double.parseDouble(reader.readLine());
            System.out.println("Введите второе слагаемое");
            b = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Сумма равна: %+.4f", (a + b));

    }
}
