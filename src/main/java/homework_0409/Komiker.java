package homework_0409;


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