package homework_1109.task1.task2.task3;


import java.util.HashSet;
import java.util.Set;

public class TunelCarInfo {
    // Создаем HashSet для хранения номеров автомобилей в туннеле
    private Set<String> carsInTunnel = new HashSet<>();

    // Метод для регистрации въезда автомобиля в туннель
    public void carInTunel(String carNumber) {
        carsInTunnel.add(carNumber);
        System.out.println("Автомобиль " + carNumber + " въехал в туннель.");
    }

    // Метод для регистрации выезда автомобиля из туннеля
    public void carOutTunel(String carNumber) {
        if (carsInTunnel.remove(carNumber)) {
            System.out.println("Автомобиль " + carNumber + " выехал из туннеля.");
        } else {
            System.out.println("Автомобиль " + carNumber + " не найден в туннеле.");
        }
    }

    // Метод для получения текущего количества автомобилей в туннеле
    public int getCarsCount() {
        return carsInTunnel.size();
    }

    public static void main(String[] args) {
        TunelCarInfo info = new TunelCarInfo();

        // Регистрируем въезды автомобилей
        info.carInTunel("A123BC");
        info.carInTunel("B456DE");
        info.carInTunel("C789FG");

        // Выводим количество автомобилей в туннеле
        System.out.println("Количество автомобилей в туннеле: " + info.getCarsCount());

        // Регистрируем выезд автомобиля
        info.carOutTunel("A123BC");

        // Выводим обновленное количество автомобилей в туннеле
        System.out.println("Количество автомобилей в туннеле: " + info.getCarsCount());
    }
}
