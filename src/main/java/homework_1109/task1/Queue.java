package homework_1109.task1;

//1 уровень сложности: 1. Вы приходите в гос.учреждение и регистрируетесь, получив талон с номером в очереди.
//        Обслуживание будет проводиться строго по номеру в порядке возрастания.
//        Какой тип Set вы будете использовать при решении данной задачи?
//        Напишите пример.

import java.util.TreeSet;

public class Queue {

    public static void main(String[] args) {
        // Создаем TreeSet для хранения номеров очереди
        TreeSet<Integer> queue = new TreeSet<>();

        // Регистрация клиентов в очереди (добавление номеров)
        queue.add(5);
        queue.add(1);
        queue.add(10);
        queue.add(3);
        queue.add(2);

        // Обслуживание клиентов
        while (!queue.isEmpty()) {

            Integer nextClient = queue.pollFirst();
            System.out.println("Es wird ein Kunde bedient werden mit Nummer: " + nextClient);
        }
    }
}

