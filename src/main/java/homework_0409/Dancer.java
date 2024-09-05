package homework_0409;

//Вы владелеw концертного зала со сценой. Вы нанимаете артистов различного жанра,
//которые развлекают зрителей, используя свои таланты. Реализуйте класс Концерт,
//в котором разные артисты будут выходить на сцену и развлекать зрителей используя
//свои умения и талант. Подумайте, можно для класса Концерт применить Generiс подход
//к реализации?


public class Dancer implements Performer {
    private String danceStyle;

    public Dancer(String danceStyle) {
        this.danceStyle = danceStyle;
    }

    @Override
    public void perform() {
        System.out.println("Танцор исполняет " + danceStyle + " танец");
    }
}