package homework_0409;

//Создайте обобщенный интерфейс для калькулятора, в котором будут объявлен перечень операций,
//которые умеет делать ваш калькулятор add, sub, multi и div и реализуйте классы, которые
//будут включать данный интерфейс для работы с различными типами данных аргументов

public class MainCalculator {
    public static void main(String[] args) {


        Calculator<Integer> intCalc = new IntegerCalculator();
        System.out.println("Integer Addition: " + intCalc.add(20, 4));
        System.out.println("Integer Division: " + intCalc.div(20, 4));
        System.out.println("Integer Subtraction: " + intCalc.sub(20, 4));
        System.out.println("Integer Multiplication: " + intCalc.multi(20, 4));

        Calculator<Double> doubleCalc = new DoubleCalculator();
        System.out.println("Double Addition: " + doubleCalc.add(10.5, 2.5));
        System.out.println("Double Division: " + doubleCalc.div(10.5, 2.5));
        System.out.println("Double Subtraction: " + doubleCalc.sub(10.5, 2.5));
        System.out.println("Double Multiplication: " + doubleCalc.multi(10.5, 2.5));

       }
}

