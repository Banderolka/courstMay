package taskFour;

import java.util.ArrayList;
import java.util.List;

public class Present {
    public static void main(String[] args) {

        List<Sweetness> prisentBox = new  ArrayList<Sweetness>();
        prisentBox.add(new Candy("Барбарис",220,115,"Карамель"));
        prisentBox.add(new Jellybean("Мусики",250,180, "Мишки"));
        prisentBox.add(new ChewingGum("Love is", 180, 162,"Love is"));
        prisentBox.add(new ChocolateBar("Mars", 200, 200,"Nougat"));

        double weight = 0;
        double price = 0;
        for (Sweetness x: prisentBox){
            price = price + x.getPrice();
            weight = weight + x.getWeight();
            System.out.println(x);
        }
        System.out.println("Цена подарка: " + price);
        System.out.println("Вес подарка: " + weight);


    }
}
