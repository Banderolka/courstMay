package taskFour;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] ints = new int[20]; // создал массив размером в 20 элементов

        Random random = new Random();
        // заполняю массив рандомными значениями от -10 до 10
        for (int i = 0; i < 20; i++) {
            ints[i] = (random.nextInt(20) - 10);
            System.out.print(ints[i] + " ");
        }

        int max = Integer.MIN_VALUE; // переменная для максимального отрицательного значения
        int maxElement = 21; // переменная для элемента массива с максимальным отрицательным значением
        int min = Integer.MAX_VALUE; // переменная для минимального положительного значения
        int minElement = 21; //переменная для элемента массива с минимально положительного знаения

        // алгоритм для нахождения максимального отрицательного значения и эго места в массиве, и нахождения минимального положительного значения и эго места в массиве
        for (int i = 0; i < 20; i++) {
            if (ints[i] < 0 && ints[i] > max) {
                max = ints[i];
                maxElement = i;
            }
            if (ints[i] > 0 && ints[i] < min){
                min = ints[i];
                minElement = i;
            }
        }

        // меняю местами минмальное и максимальное значения
        ints[maxElement] = min;
        ints[minElement] = max;

        System.out.println("");
        for(int x: ints){
            System.out.print(x + " ");
        }
    }
}
