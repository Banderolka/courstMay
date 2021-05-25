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
public class Base {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        ArrayString arrayString = new ArrayString();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите:\n1 - выполнить вычисления на калькуляторе \n2 - работа с массивом");

        String str = reader.readLine();
        if (str.equals("1")) calculator.selectOperation();
        else if (str.equals("2")) arrayString.workingWithAnArray();
        reader.close();

    }
}

/**
 * @author Gudimenko Oltg
 * @see #selectOperation() происходит выбор операции и ввод цифр над которыми проводим операции
 */

class Calculator {


    void selectOperation() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите числа");
        Double a = Double.parseDouble(reader.readLine());
        Double b = Double.parseDouble(reader.readLine());
        System.out.println("Выберите операцию:\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление");
        String str = reader.readLine();
        if (str.equals("1")) {
            sum(a, b);
        } else if (str.equals("2")) {
            subtraction(a, b);
        } else if (str.equals("3")) {
            multiplication(a, b);
        } else if (str.equals("4")) {
            division(a, b);
        }
        reader.close();

    }

    void sum(Double a, Double b) {
        System.out.printf("Сумма равна: %+.4f", (a + b));
    }

    void subtraction(Double a, Double b) {
        System.out.printf("Разница равна: %+.4f", (a - b));
    }

    void multiplication(Double a, Double b) {
        System.out.printf("Произведение равно: %+.4f", (a * b));
    }

    void division(Double a, Double b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
            return;
        }

        System.out.printf("Частное равно: %+.4f", (a / b));
    }

}

/**
 * @author Gudimenko Oltg
 * @see #workingWithAnArray() вводим размер массива, заполняем массив и находим наибольшее слово в массиве
 */

class ArrayString {
    void workingWithAnArray() throws IOException {
        int arraySize; // для размера массива
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива");
        arraySize = Integer.parseInt(reader.readLine()); // вводим размер массива

        // заполняем массив с клавиатуры
        String[] arrayString = new String[arraySize];
        System.out.println("Заполните массив словами");
        for (int i = 0; i < arraySize; i++) {
            arrayString[i] = reader.readLine();
        }
        reader.close();

        //находим наибольшое слово в массиве
        String max = arrayString[0];
        for (int i = 1; i < arraySize; i++) {
            if (max.length() < arrayString[i].length()){
                max = arrayString[i];
            }
        }

        System.out.println("Самое длинное слово в массиве: " + max);

    }
}

