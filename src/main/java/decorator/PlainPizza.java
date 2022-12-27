package decorator;

public class PlainPizza implements Pizza {
    @Override
    public String bake() {
        return "Baking plain pizza.";
    }
}
