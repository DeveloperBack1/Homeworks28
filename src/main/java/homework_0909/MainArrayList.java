package homework_0909;


import java.util.ArrayList;
import java.util.Iterator;

public class MainArrayList {
    public static void main(String[] args) {
        // Создаем ArrayList и добавляем элементы
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(55);
        list.add(65);
        list.add(75);

        // Нахождение среднего значения элементов
        double sum = 0;
        for (int num : list) {
            sum += num;
        }

        // Если список не пустой, вычисляем среднее
        if (!list.isEmpty()) {

            double average = sum / list.size();
            System.out.println("Среднее значение: " + average);
        }

        if (list.isEmpty()) {
            System.out.println("Список пуст");
        } else {

            int min = list.get(0);

            // Проходим по элементам и ищем наименьший
            for (int num : list) {
                if (num < min) {
                    min = num;
                }
            }

            System.out.println("Наименьший элемент: " + min);

        }
        int sum1 = 0;

        // Проходим по всем элементам списка и суммируем их
        for (int num : list) {
            sum1 += num;
        }

        System.out.println("Сумма всех элементов: " + sum1);

        int sumOfSquares = 0;

        // Проходим по всем элементам списка и находим сумму их квадратов
        for (int num : list) {
            sumOfSquares += num * num; // Возведение в квадрат и сложение
        }

        System.out.println("Сумма квадратов всех элементов: " + sumOfSquares);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove(); // Удаляем элемент, если он четный
            }
        }

        // Выводим оставшиеся элементы списка
        System.out.println("ArrayList после удаления четных чисел: " + list);

        Integer max1 = null; // Самый большой элемент
        Integer max2 = null; // Второй по величине элемент

        for (int num : list) {
            if (max1 == null || num > max1) {
                // Обновляем max2 перед обновлением max1
                max2 = max1;
                max1 = num;
            } else if (num != max1 && (max2 == null || num > max2)) {
                max2 = num;
            }
        }
        System.out.println("Второй по величине элемент: "+max2);




    }
}

