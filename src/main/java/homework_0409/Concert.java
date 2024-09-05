package homework_0409;

//Вы владелеw концертного зала со сценой. Вы нанимаете артистов различного жанра,
//которые развлекают зрителей, используя свои таланты. Реализуйте класс Концерт,
//в котором разные артисты будут выходить на сцену и развлекать зрителей используя
//свои умения и талант. Подумайте, можно для класса Концерт применить Generiс подход
//к реализации?


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
