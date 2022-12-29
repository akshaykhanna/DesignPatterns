package strategy;

public class SubtractOperatio implements ICalculateStrategy {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
