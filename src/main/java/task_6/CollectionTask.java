package task_6;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static javafx.scene.input.KeyCode.T;

public class CollectionTask {
    public static void main(String[] args) throws IOException {
        String fileName = "";
        List<String> arrayList = new ArrayList<String>();
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        scanner.useDelimiter("\\s");

        while (scanner.hasNext()) {
            arrayList.add(scanner.next());
        }

        Collections.sort(arrayList);

        Map<String, Integer> map = new TreeMap<>();
        Integer count = 0;

        for (int i = 0; i < arrayList.size(); i++){
            for (int j = 0; j < arrayList.size();){
                if (arrayList.get(i).equals(arrayList.get(j))){
                    count++;
                }
                j++;
            }
            map.put(arrayList.get(i),count);
            count = 0;
        }
//
//
        for (String name: map.keySet()){
            String key = name;
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }




        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        System.out.println("Самое частопоторяющееся слово: " + maxEntry.getKey() + " " + "Повторяется: " + Collections.max(map.values()));


    }
}
