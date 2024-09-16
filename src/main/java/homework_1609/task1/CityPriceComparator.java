package homework_1609.task1;


import java.util.Comparator;

public class CityPriceComparator implements Comparator<House> {
    private String city;

    public CityPriceComparator(String city) {
        this.city = city;
    }

    @Override
    public int compare(House h1, House h2) {
        // Сравниваем дома только в указанном городе
        if (!h1.city.equals(city) && !h2.city.equals(city)) {
            return 0; // если оба дома не в интересующем городе, считаем их равными
        }
        if (!h1.city.equals(city)) {
            return 1; // если первый дом не в нужном городе, помещаем его "в конец"
        }
        if (!h2.city.equals(city)) {
            return -1; // если второй дом не в нужном городе, помещаем его "в конец"
        }
        // Сравниваем по цене, если оба дома в интересующем городе
        return Integer.compare(h1.price, h2.price);
    }
}
