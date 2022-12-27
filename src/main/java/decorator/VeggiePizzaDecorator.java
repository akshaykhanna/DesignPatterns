package decorator;

public class VeggiePizzaDecorator extends PizzaDecorator{
    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + " Add veggie topping to it.";
    }
}
