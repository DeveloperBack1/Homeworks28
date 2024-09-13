package homework_1309.task1.task2;

import java.util.TreeSet;


public class MainBankService {
    public static void main(String[] args) {
        // Создаем TreeSet для хранения и автоматической сортировки талончиков по номеру
        TreeSet<Ticket> tickets = new TreeSet<>();

        // Добавляем клиентов
        tickets.add(new Ticket(5, "Иванов Иван Иванович", 1985,
                "Консультация"));
        tickets.add(new Ticket(2, "Петров Петр Петрович", 1990,
                "Получение денежных средств"));
        tickets.add(new Ticket(7, "Сидорова Анна Николаевна", 1995,
                "Открытие депозита"));
        tickets.add(new Ticket(1, "Смирнов Алексей Алексеевич", 1980,
                "Коммунальные платежи"));

        // Обслуживание клиентов в порядке возрастания номеров талончиков
        System.out.println("Обслуживание клиентов по номерам талончиков:");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}