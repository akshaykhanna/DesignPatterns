package decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaTest {
    @Test
    void shouldAbleGetAPlainPizza() {
        Pizza pizza = new PlainPizza();

        Assertions.assertEquals("Baking plain pizza.", pizza.bake());
    }

    @Test
    void shouldAbleGetACheesePizza() {
        Pizza pizza = new CheesePizzaDecorator(new PlainPizza());
        Assertions.assertEquals("Baking plain pizza. Add cheese topping to it.", pizza.bake());
    }

    @Test
    void shouldAbleGetVeggiePizza() {
        Pizza pizza = new VeggiePizzaDecorator(new PlainPizza());
        Assertions.assertEquals("Baking plain pizza. Add veggie topping to it.", pizza.bake());
    }

    @Test
    void shouldAbleGetChesseVeggiePizza() {
        Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        Assertions.assertEquals("Baking plain pizza. Add cheese topping to it. Add veggie topping to it.", pizza.bake());
    }
}