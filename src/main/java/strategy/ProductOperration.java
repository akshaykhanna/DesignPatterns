package strategy;

public class ProductOperration implements ICalculateStrategy {
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
}
