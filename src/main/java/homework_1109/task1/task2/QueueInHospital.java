package homework_1109.task1.task2;

//
//Вы приходите в больницу и получаете талончик, в котором написана Ваши Ф.И.О.
//        Но подойдя к кабинету врача, Вы видите что обслуживание ведеться строго по живой очереди.
//        Кто первый пришел, тот первый и заходит к врачу и номер талона не играет роли.
//        Какой тип Set вы будете использовать при решении данной задачи?
//        Напишите пример.

import java.util.LinkedHashSet;
import java.util.Set;

public class QueueInHospital {
    public static void main(String[] args) {
        // Создаем LinkedHashSet для хранения людей в порядке живой очереди
        Set<String> queue = new LinkedHashSet<>();

        // Добавляем людей в очередь
        queue.add("Иванов Степан Андреевич");
        queue.add("Сазонов Игорь Петрович");
        queue.add("Куйбышев Сергей Юрьевич");
        queue.add("Кузнецова Анна Николаевна");
        queue.add("Семёнова Ирина Антоновна");

        // Обслуживание людей по живой очереди
        for (String patient : queue) {
            System.out.println("Обслуживается: " + patient);
        }
    }
}
