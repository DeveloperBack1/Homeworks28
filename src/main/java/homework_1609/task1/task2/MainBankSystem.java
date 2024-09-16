package homework_1609.task1.task2;


import java.util.TreeSet;

public class MainBankSystem {
    public static void main(String[] args) {
        // Создаем множество для хранения и сортировки талончиков по номеру
        TreeSet<Ticket> queue = new TreeSet<>();

        // Добавляем клиентов
        queue.add(new Ticket("Иван Иванов", 1985, "Консультация", 3));
        queue.add(new Ticket("Анна Петрова", 1990, "Получение денежных средств", 1));
        queue.add(new Ticket("Сергей Сидоров", 1978, "Вложение средств", 4));
        queue.add(new Ticket("Мария Смирнова", 1995, "Открытие депозита", 2));

        // Обслуживаем клиентов в порядке номеров талончиков
        System.out.println("Обслуживание клиентов:");
        for (Ticket ticket : queue) {
            System.out.println("Обслуживается клиент: " + ticket);
        }
    }
}
