package homework_0409;

//Создайте обобщенный интерфейс для калькулятора, в котором будут объявлен перечень операций,
//которые умеет делать ваш калькулятор add, sub, multi и div и реализуйте классы, которые
//будут включать данный интерфейс для работы с различными типами данных аргументов.

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
