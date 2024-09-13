package homework_1309.task1.task2;


import java.util.TreeSet;

class Ticket implements Comparable<Ticket> {
    private int number;
    private String fullName;
    private int birthYear;
    private String operationType; // Тип операции

    public Ticket(int number, String fullName, int birthYear, String operationType) {
        this.number = number;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.operationType = operationType;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Ticket other) {
        // Сравниваем по номеру талончика для сортировки
        return Integer.compare(this.number, other.number);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", fullName='" + fullName + '\'' +
                ", birthYear=" + birthYear +
                ", operationType='" + operationType + '\'' +
                '}';
    }
}



