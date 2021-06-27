import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Gudimenko Oltg
 * @see #selectOperation() происходит выбор операции и ввод цифр над которыми проводим операции
 */


public class Calculator extends ReadClass {
    private double a;
    private double b;

    public Calculator() {

    }


    public void selectOperation() {
        System.out.println("Введиьте цифры");
        a = nextDouble();
        b = nextDouble();

        System.out.println("Выберите операцию:\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление");
        int numberOperation = (int) nextDouble();
        if (numberOperation == 1) {
            System.out.printf("Сумма равна: %+.2f", sum());
        } else if (numberOperation == 2) {
            System.out.printf("Разница равна: %+.2f", subtraction());
        } else if (numberOperation == 3) {
            System.out.printf("Произведение равно: %+.2f", multiplication());
        } else if (numberOperation == 4) {
            System.out.printf("Частное равно: %+.2f", division());
        }


    }

    private double sum() {
        return a + b;
    }

    private double subtraction() {
        return a - b;
    }

    private double multiplication() {
        return a * b;
    }

    private double division() {
        return a / b;
    }

}
