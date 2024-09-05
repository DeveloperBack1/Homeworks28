package homework_0409;

//Вы владелеw концертного зала со сценой. Вы нанимаете артистов различного жанра,
//которые развлекают зрителей, используя свои таланты. Реализуйте класс Концерт,
//в котором разные артисты будут выходить на сцену и развлекать зрителей используя
//свои умения и талант. Подумайте, можно для класса Концерт применить Generiс подход
//к реализации?

public class MainConcert {
    public static void main(String[] args) {
        Concert<Performer> concert = new Concert<>();

        Musiker musiker = new Musiker("гитара");
        Dancer dancer = new Dancer("балет");
        Komiker komiker = new Komiker("ирония");

        //  артисты на концерт
        concert.addPerformer(musiker);
        concert.addPerformer(dancer);
        concert.addPerformer(komiker);

        // Начинается концерт
        concert.start();
    }
}