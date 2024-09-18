package homework_1809.task1.task2;

public class MainWareHouse2Doors {
    public static void main(String[] args) {
        // Инициализируем склад с максимальной вместимостью 5 единиц продукции
        WareHouse2Doors warehouse = new WareHouse2Doors(5);

        // Имитируем процесс работы склада
        warehouse.loadProduct(11);
        warehouse.loadProduct(12);
        warehouse.loadProduct(13);
        warehouse.loadProduct(14);
        warehouse.loadProduct(15);


        warehouse.showWarehouseState(); // Текущее состояние склада

        warehouse.unloadProduct(); // Отгрузка товара
        warehouse.showWarehouseState(); // Текущее состояние склада

        warehouse.loadProduct(16); // Загрузка товара 16
        warehouse.loadProduct(17); // Загрузка товара 17
        warehouse.loadProduct(18); // Загрузка товара 18
        warehouse.loadProduct(19); // Загрузка товара 19
        warehouse.showWarehouseState(); // Текущее состояние склада

        warehouse.unloadProduct(); // Отгрузка товара
        warehouse.unloadProduct(); // Отгрузка товара
        warehouse.showWarehouseState(); // Текущее состояние склада
    }
}

