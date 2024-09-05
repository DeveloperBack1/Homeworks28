package homework_0409;


public class DoubleCalculator implements Calculator<Double> {
    @Override
    public Double add(Double a, Double b) {
        return a + b;

    }

    @Override
    public Double sub(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multi(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double div(Double a, Double b) {
        if (b == 0) {
            throw new ArithmeticException("Absolute Verbot: teilen auf Null!!!");
        }
        return a / b;
    }
}
