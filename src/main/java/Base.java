import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gudimenko Oltg
 * @see #main(String[]) в методе разводящаая точка между Calculator и ArrayString
 *
 *
 */
public class Base {
    public static void main(String[] args) throws IOException {

        ReadClass readClass = new ReadClass();
        double a;
        double b;

        System.out.println("Введиьте цифры");
        a = readClass.nextDouble();
        b = readClass.nextDouble();
        Calculator calculator = new Calculator(a, b);
        System.out.println("Выберите операцию:\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление");
        int operation = (int)readClass.nextDouble();

        switch (operation){
            case 1:
                System.out.printf("Сумма равна: %+.2f", calculator.sum());
                break;
            case 2:
                System.out.printf("Разница равна: %+.2f", calculator.subtraction());
                break;
            case 3:
                System.out.printf("Произведение равно: %+.2f", calculator.multiplication());
                break;
            case 4:
                System.out.printf("Частное равно: %+.2f", calculator.division());
                break;
        }
    }


}





