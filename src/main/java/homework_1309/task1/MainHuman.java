package homework_1309.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainHuman {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Alice", 25, "blue"));
        humans.add(new Human("Bob", 30, "green"));
        humans.add(new Human("Charlie", 15, "brown"));
        humans.add(new Human("Alice", 25, "blue")); // Дубликат

        // 1. Выводим все элементы на экран
        System.out.println("Все элементы:");
        for (Human human : humans) {
            System.out.println(human);
        }

        // 2. Выводим только тех, у кого цвет глаз голубой
        System.out.println("\nЛюди с голубыми глазами: ");
        for (Human human : humans) {
            if ("blue".equals(human.eyeColor)) {
                System.out.println(human);
            }
        }


        humans.removeIf(human -> human.age < 16);

        System.out.println("\nПосле удаления людей младше 16 лет:");
        for (Human human : humans) {
            System.out.println(human);
        }

        //  уникальные элементы
        Set<Human> uniqueHumans = new HashSet<>(humans);
        ArrayList<Human> uniqueHumanList = new ArrayList<>(uniqueHumans);

        System.out.println("\nУникальные элементы:");
        for (Human human : uniqueHumanList) {
            System.out.println(human);
        }
    }
}
