package taskFour;

public class Jellybean extends Sweetness {
    private String form;

    public Jellybean(String name, double weight, double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return super.toString() + " Форма: " + form;
    }
}
