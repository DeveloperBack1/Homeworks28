package homework_1309.task1;

//Создать ArrayList с объектами вашего собственного класса (например Human) и вывести их на экран.
//        Создать ArrayList с объектами вашего собственного класса и вывести только те, которые
//        удовлетворяют определенному условию.
//        (например цвет глаз = голубой)
//        Создать ArrayList с объектами вашего собственного класса и удалить все элементы,
//        удовлетворяющие определенному условию.
//        (например возраст человека < 16 лет)
//        *Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы.


public class Human {
    String name;
    int age;
    String eyeColor;

    Human(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', age=" + age + ", eyeColor='" + eyeColor + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && name.equals(human.name) && eyeColor.equals(human.eyeColor);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + eyeColor.hashCode();
    }
}

