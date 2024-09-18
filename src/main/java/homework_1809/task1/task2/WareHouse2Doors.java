package homework_1809.task1.task2;


import java.util.ArrayDeque;
import java.util.Deque;

public class WareHouse2Doors {

    private Deque<Integer> products;
    private int maxCapacity;

    public WareHouse2Doors(int maxCapacity) {
        this.products = new ArrayDeque<>();
        this.maxCapacity = maxCapacity;
    }

    // Метод для загрузки товара через одну дверь (в начало очереди)
    public void loadProduct(int product) {
        if (products.size() < maxCapacity) {
            products.addFirst(product);
            System.out.println("Товар " + product + " загружен через дверь загрузки (в начало склада).");
        } else {
            System.out.println("Склад переполнен! Невозможно загрузить товар.");
        }
    }

    // Метод для отгрузки товара через другую дверь (с конца очереди)
    public void unloadProduct() {
        if (!products.isEmpty()) {
            int product = products.pollLast(); // Удаляем товар с конца очереди
            System.out.println("Товар " + product + " отгружен через дверь отгрузки (с конца склада).");
        } else {
            System.out.println("Склад пуст! Нет товаров для отгрузки.");
        }
    }

    // Метод для вывода состояния склада
    public void showWarehouseState() {
        System.out.println("Текущее состояние склада: " + products);
    }
}