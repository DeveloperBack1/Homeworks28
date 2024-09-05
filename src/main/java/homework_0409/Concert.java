package homework_0409;


import java.util.ArrayList;
import java.util.List;
public class Concert<T extends Performer> {
    private List<T> performers = new ArrayList<>();

    // Добавить артиста в концерт
    public void addPerformer(T performer) {
        performers.add(performer);

    }

    // Провести концерт
    public void start() {
        System.out.println("Концерт начинается!");
        for (T performer : performers) {
            performer.perform();
        }
        System.out.println("Концерт завершён!");
    }
}
