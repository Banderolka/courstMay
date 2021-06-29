import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayString extends ReadClass {
    int arraySize; // для размера массива
    private  String[] arrayString;

    public int sizeArray(){
        System.out.println("Введите размер массива");
        arraySize = (int) nextDouble();
        fillingArray();
        return arraySize;
    }

    private String[] fillingArray() {
        // заполняем массив с клавиатуры
         arrayString = new String[arraySize];
        System.out.println("Заполните массив словами");
        for (int i = 0; i < arraySize; i++) {
            arrayString[i] = nextString();
        }
       sorting();
        return arrayString;
    }

        //находим наибольшое слово в массиве
    private void sorting(){

        String max = arrayString[0];
        for (int i = 1; i < arraySize; i++) {
            if (max.length() < arrayString[i].length()) {
                max = arrayString[i];
            }
        }

        System.out.println("Самое длинное слово в массиве: " + max);

    }
}
