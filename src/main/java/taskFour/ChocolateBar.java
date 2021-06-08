package taskFour;

public class ChocolateBar extends Sweetness {
    private String filling;

    public ChocolateBar(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return super.toString() + " Начинка: " + filling;
    }
}
