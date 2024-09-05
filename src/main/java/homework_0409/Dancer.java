package homework_0409;

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