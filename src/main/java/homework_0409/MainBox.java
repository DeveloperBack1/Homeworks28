package homework_0409;

//У вас есть на почте коробка, у которой есть 3 характеристики: высота, длина и ширина.
//В коробку вы можете положить любой объект (главное чтобы он влез по габаритам)
//и его отправить по почте или получить по почте.
//Как Вы думаете, можем ли мы использовать для создания данного класса Generic подход?
//        Если да, попробуйте реализовать данный класс.


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
