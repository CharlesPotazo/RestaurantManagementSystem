package DataLayer;


public class FoodModel {
    private String name;
    private double price;

    public FoodModel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}