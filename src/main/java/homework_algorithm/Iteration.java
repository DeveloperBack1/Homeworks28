package homework_algorithm;

public class Iteration {
    public static void main(String[] args) {
        int result = funIteration(5, 3);
        System.out.println("Result: " + result);
    }


    private static int funIteration(int x, int y) {
        // Печатаем начальные значения x и y
        System.out.println(" x = " + x + "; y = " + y);

        while (x > 0) {
            y = x + y; // Обновляем значение y, как это делалось в рекурсивной функции
            x--; // Уменьшаем x на 1
            System.out.println("x = " + x + "; y = " + y);
        }

        return y;
    }

}