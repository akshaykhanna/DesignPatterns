package strategy;

public class DivisionOperation implements ICalculateStrategy {
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
}
