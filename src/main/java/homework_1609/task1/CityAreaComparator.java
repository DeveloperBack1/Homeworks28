package homework_1609.task1;


import java.util.Comparator;

public class CityAreaComparator implements Comparator<House> {
    @Override
    public int compare(House h1, House h2) {
        // Сравниваем сначала по городу
        int cityComparison = h1.city.compareTo(h2.city);
        if (cityComparison != 0) {
            return cityComparison;
        }
        // Если города одинаковые, сравниваем по площади
        return Integer.compare(h1.area, h2.area);
    }
}
