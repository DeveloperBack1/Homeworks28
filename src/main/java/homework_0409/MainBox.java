package homework_0409;


public class MainBox {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>(10, 15, 20);

        // Помещаем строку в коробку
        stringBox.putItem("Подарок");
        stringBox.send();

        // Извлекаем объект из коробки
        String item = stringBox.getItem();
        System.out.println("Извлечено из коробки: " + item);

        // Коробка для хранения числа
        Box<Integer> intBox = new Box<>(5, 5, 5);
        intBox.putItem(100);
        intBox.receive();

        // Извлекаем объект из коробки
        int number = intBox.getItem();
        System.out.println("Извлечено из коробки: " + number);
    }
}
