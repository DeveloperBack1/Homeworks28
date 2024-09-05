package homework_0409;


public class IntegerCalculator implements Calculator<Integer> {
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multi(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer div(Integer a, Integer b) {
        if (b == 0) {

            throw new ArithmeticException("Absolute Verbot: teilen auf Null!!!");
        }
        return a / b;
    }
}
