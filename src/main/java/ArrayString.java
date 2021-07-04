import calcu.ReadClass;

/**
 * @see ArrayString в классе реализована работа с массивом
 */

public class ArrayString extends ReadClass {
    int arraySize; // для размера массива
    private  String[] arrayString;

    public int sizeArray(){
        System.out.println("Введите размер массива");
        arraySize = (int) nextDouble();
        fillingArray();
        return arraySize;
    }

    public String[] fillingArray() {
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
        public String sorting(){

        String max = arrayString[0];
        for (int i = 1; i < arraySize; i++) {
            if (max.length() < arrayString[i].length()) {
                max = arrayString[i];
            }
        }

       return max;

    }
}
