package homework_1809.task1;

//1) Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
//У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
//Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//Напишите программу, которая бы имитировала работу.


import java.util.LinkedList;
import java.util.Queue;

public class WareHouse {

    private Queue<Integer> products;
    private int maxCapacity;

    public WareHouse(int maxCapacity) {
        this.products = new LinkedList<>();
        this.maxCapacity = maxCapacity;
    }

    // Метод для загрузки товара на склад
    public void loadProduct(int product) {
        if (products.size() < maxCapacity) {
            products.add(product);
            System.out.println("Товар " + product + " загружен на склад.");
        } else {
            System.out.println("Склад переполнен! Невозможно загрузить товар.");
        }
    }

    // Метод для отгрузки товара со склада
    public void unloadProduct() {
        if (!products.isEmpty()) {
            int product = products.poll(); // Удаляем товар с начала очереди
            System.out.println("Товар " + product + " отгружен со склада.");
        } else {
            System.out.println("Склад пуст! Нет товаров для отгрузки.");
        }
    }

    // Метод для вывода состояния склада
    public void showWarehouseState() {
        System.out.println("Текущее состояние склада: " + products);
    }
}