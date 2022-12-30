package iterator;

public class Mobile implements Item {
    private String id;
    private String name;
    private int quantity;
    private double price;

    public Mobile(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double totalCost() {
        return this.price * this.quantity;
    }
}
