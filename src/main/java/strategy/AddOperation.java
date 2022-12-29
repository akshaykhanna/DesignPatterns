package strategy;

public class AddOperation implements ICalculateStrategy {
    @Override
    public double calculate(double a, double b) {
        return a + b;
    }
}
