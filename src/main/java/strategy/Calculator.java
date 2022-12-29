package strategy;

public class Calculator {

    public double executeOperation(int a, int b, ICalculateStrategy operation) {
        return operation.calculate(a, b);
    }
}
