package homework_0409;


public class Musiker implements Performer {
    private String instrument;

    public Musiker(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {

        System.out.println("Музыкант играет на " + instrument);
    }
}