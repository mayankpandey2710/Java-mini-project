package assignmentjava;

public class Smartphone {

    String ModelName;
    int price;
    String color;

    public Smartphone(String ModelName, int price, String color) {
        this.ModelName = ModelName;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.ModelName + " " + this.color + " " + this.price;
    }
}