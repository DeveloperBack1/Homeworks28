package homework_0409;

//У вас есть на почте коробка, у которой есть 3 характеристики: высота, длина и ширина.
//В коробку вы можете положить любой объект (главное чтобы он влез по габаритам)
//и его отправить по почте или получить по почте.
//Как Вы думаете, можем ли мы использовать для создания данного класса Generic подход?
//        Если да, попробуйте реализовать данный класс.


public class Box<T> {
    private double height;
    private double length;
    private double width;
    private T item;  // Объект, который будет храниться в коробке

    public Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }


    // Геттеры и сеттеры
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Метод для помещения объекта в коробку
    public void putItem(T item) {
        this.item = item;
        System.out.println("Объект помещен в коробку.");
    }

    // Метод для извлечения объекта из коробки
    public T getItem() {
        System.out.println("Объект извлечен из коробки.");
        return item;
    }

    // Метод для отправки коробки по почте
    public void send() {
        System.out.println("Коробка отправлена по почте.");
    }

    // Метод для получения коробки
    public void receive() {
        System.out.println("Коробка получена по почте.");
    }
}