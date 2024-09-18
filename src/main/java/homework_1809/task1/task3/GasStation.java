package homework_1809.task1.task3;


import java.util.Comparator;
import java.util.PriorityQueue;



// Класс Транспорт
class Vehicle {
    private String type;
    private int priority; // Приоритет заправки (чем выше значение, тем выше приоритет)

    public Vehicle(String type, int priority) {
        this.type = type;
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return type;
    }
}

// Компаратор для очереди приоритетов
class VehicleComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        // Сравниваем транспортные средства по приоритету (чем выше приоритет, тем выше в очереди)
        return Integer.compare(v2.getPriority(), v1.getPriority());
    }
}

public class GasStation {
    // Очередь на заправку с приоритетами
    private PriorityQueue<Vehicle> queue;

    public GasStation() {
        // Инициализация очереди с использованием компаратора для приоритетов
        queue = new PriorityQueue<>(new VehicleComparator());
    }

    // Метод для добавления транспортного средства в очередь
    public void addVehicle(Vehicle vehicle) {
        queue.offer(vehicle);
        System.out.println(vehicle.getType() + " добавлен в очередь на заправку.");
    }

    // Метод для заправки транспортного средства
    public void refuelVehicle() {
        if (!queue.isEmpty()) {
            Vehicle vehicle = queue.poll(); // Убираем транспортное средство с максимальным приоритетом
            System.out.println(vehicle.getType() + " заправлен.");
        } else {
            System.out.println("Нет транспортных средств для заправки.");
        }
    }

    public static void main(String[] args) {
        GasStation gasStation = new GasStation();

        // Создаем транспортные средства с разными приоритетами
        Vehicle ambulance = new Vehicle("Скорая помощь", 3);
        Vehicle bus = new Vehicle("Общественный автобус", 2);
        Vehicle regularCar = new Vehicle("Обычный автомобиль", 1);
        Vehicle cityServiceTruck = new Vehicle("Технологический транспорт городских служб", 2);

        // Добавляем транспортные средства в очередь
        gasStation.addVehicle(regularCar);        // Обычная машина
        gasStation.addVehicle(bus);               // Общественный автобус
        gasStation.addVehicle(ambulance);         // Скорая помощь
        gasStation.addVehicle(cityServiceTruck);  // Технологический транспорт

        System.out.println("\nНачинаем заправку:");
        gasStation.refuelVehicle(); // Ожидается, что первым будет заправлена скорая помощь
        gasStation.refuelVehicle(); // Далее автобус, т.к. час пик
        gasStation.refuelVehicle(); // Технологический транспорт городских служб
        gasStation.refuelVehicle(); // Обычный автомобиль
    }
}
