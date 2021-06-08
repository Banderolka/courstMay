package taskFour;

public class ChewingGum extends Sweetness{
    private String brand;

    public ChewingGum(String name, double weight, double price, String brand) {
        super(name, weight, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() + " Бренд: " + brand;
    }
}

