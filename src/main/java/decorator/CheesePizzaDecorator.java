package decorator;

public class CheesePizzaDecorator extends PizzaDecorator {
    public CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + " Add cheese topping to it.";
    }
}
