package strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void shouldAbleToAddTwoNumbers() {
        Calculator calculator = new Calculator();
        ICalculateStrategy addOperation = new AddOperation();
        var actualSum = calculator.executeOperation(20, 5, addOperation);
        Assertions.assertEquals(25, actualSum);
    }
    @Test
    void shouldAbleToSubtractTwoNumbers() {
        Calculator calculator = new Calculator();
        ICalculateStrategy subtractOperation = new SubtractOperatio();
        var actualDiff = calculator.executeOperation(20, 5, subtractOperation);
        Assertions.assertEquals(15, actualDiff);
    }
    @Test
    void shouldAbleToMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        ICalculateStrategy operation = new ProductOperration();
        var actualProduct = calculator.executeOperation(20, 5, operation);
        Assertions.assertEquals(100, actualProduct);
    }
    @Test
    void shouldAbleToDivideTwoNumbers() {
        Calculator calculator = new Calculator();
        ICalculateStrategy operation = new DivisionOperation();
        var actualQuotient = calculator.executeOperation(20, 5, operation);
        Assertions.assertEquals(4.0, actualQuotient);
    }
}