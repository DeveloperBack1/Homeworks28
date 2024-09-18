package homework_1809.task1;

public class MainWareHouse {
    public static void main(String[] args) {
        // Инициализируем склад с максимальной вместимостью 5 единиц продукции
        WareHouse warehouse = new WareHouse(7);

        // Имитируем процесс работы склада
        warehouse.loadProduct(1); // Загрузка товара 1
        warehouse.loadProduct(2);
        warehouse.loadProduct(3);
        warehouse.loadProduct(4);
        warehouse.loadProduct(5);
        warehouse.loadProduct(6);
        warehouse.loadProduct(7);
        warehouse.loadProduct(8);
        warehouse.showWarehouseState(); // Текущее состояние склада

        warehouse.unloadProduct(); // Отгрузка товара
        warehouse.showWarehouseState(); // Текущее состояние склада

        warehouse.loadProduct(3); // Загрузка товара 3
        warehouse.loadProduct(4); // Загрузка товара 4
        warehouse.loadProduct(5); // Загрузка товара 5
        warehouse.loadProduct(6); // Загрузка товара 6
        warehouse.showWarehouseState(); // Текущее состояние склада

        warehouse.unloadProduct(); // Отгрузка товара
        warehouse.unloadProduct(); // Отгрузка товара
        warehouse.showWarehouseState(); // Текущее состояние склада
    }
}

