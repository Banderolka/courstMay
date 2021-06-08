package taskFour;

import java.util.ArrayList;
import java.util.List;

public class Present {
    public static void main(String[] args) {
        Sweetness candy = new Candy("Барбарис",220,115,"Карамель");
        Sweetness jellybean = new Jellybean("Мусики",250,180, "Мишки");
        Sweetness chewingGum = new ChewingGum("Love is", 180, 162,"Love is");
        Sweetness chocolateBar = new ChocolateBar("Mars", 200, 200,"Nougat");

        System.out.println("Вес подарка: " + (candy.getWeight() + jellybean.getWeight() + chewingGum.getWeight() + chocolateBar.getWeight()));
        System.out.println("Цена подарка: " + (candy.getPrice() + jellybean.getPrice() + chewingGum.getPrice() + chocolateBar.getPrice()));
        System.out.println(candy.toString() + " " + jellybean.toString()+ " " + chewingGum.toString() + " " + chocolateBar.toString());
    }
}
