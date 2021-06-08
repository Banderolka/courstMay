package taskFour;

public class Candy extends Sweetness{
    private String category;

    public Candy(String name, double weight, double price, String category) {
        super(name, weight, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + " Категория: " + category;
    }
}
