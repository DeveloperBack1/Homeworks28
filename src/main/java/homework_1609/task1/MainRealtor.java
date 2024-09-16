package homework_1609.task1;

//  1. Вы автоматизируете бизнес риелторов. у вас есть класс:
//public class House {
//    int area; //площадь дома
//    int price; // цена
//    String city; // город
//    boolean hasFurniture; //продается с мебелью
//}
//- По умолчанию в вашем информационном хранилище дома сортируются по цене.
//        - Но иногда клиент хочет видеть информацию о домах в конкретном городе и осортированную по цене.
//        Реализуйте компаратор, который вы можете применить для показа клиенту в требуемом им формате.
//        - А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:
//        "город - площадь дома", что вы будете делать?


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainRealtor {
    public static void main(String[] args) {
        List<House> houses = new ArrayList<>();
        houses.add(new House(100, 200000, "Berlin", true));
        houses.add(new House(120, 250000, "Hamburg", false));
        houses.add(new House(80, 150000, "Köln", true));
        houses.add(new House(90, 180000, "Stuttgart", false));
        houses.add(new House(95, 175000, "München", true));

        // По умолчанию сортировка по цене
        System.out.println("Сортировка по цене по умолчанию:");
        Collections.sort(houses);
        for (House house : houses) {
            System.out.println(house);
        }

        // Сортировка по цене в конкретном городе
        System.out.println("\nСортировка по цене в городе Hamburg:");
        Collections.sort(houses, new CityPriceComparator("Hamburg"));
        for (House house : houses) {
            System.out.println(house);
        }

        // Сортировка по городу и площади
        System.out.println("\nСортировка по городу и площади:");
        Collections.sort(houses, new CityAreaComparator());
        for (House house : houses) {
            System.out.println(house);
        }
    }
}

