package homework_0409;

//Вы владелеw концертного зала со сценой. Вы нанимаете артистов различного жанра,
//которые развлекают зрителей, используя свои таланты. Реализуйте класс Концерт,
//в котором разные артисты будут выходить на сцену и развлекать зрителей используя
//свои умения и талант. Подумайте, можно для класса Концерт применить Generiс подход
//к реализации?


public class Komiker implements Performer {
    private String witzStyle;

    public Komiker(String witzStyle) {
        this.witzStyle = witzStyle;
    }

    @Override
    public void perform() {
        System.out.println("Комик рассказывает шутки в стиле " + witzStyle);
    }
}