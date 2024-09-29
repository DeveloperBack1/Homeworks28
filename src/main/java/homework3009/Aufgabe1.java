package homework3009;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



public class Aufgabe1 {

    public static void main(String[] args) {

//        Фильтрация списка целых чисел на нечетные числа:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);


//        Преобразование списка строк в список чисел:
        List<String> strings = Arrays.asList("1", "2", "3");
        List<Integer> numbersFromString = strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numbersFromString);


//        Суммирование списка чисел:
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


//        Определение максимального значения в списке:
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(max);


//        Фильтрация списка строк на те, которые начинаются с
//        определенной буквы и преобразование их в верхний регистр:
        List<String> words = Arrays.asList("apple", "banana", "apricot", "blueberry");
        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredWords);


//        Получение списка уникальных слов из списка строк, длина которых больше 4 символов:

        List<String> uniqueWords = words.stream()
                .filter(word -> word.length() > 4)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueWords);


//        Преобразование списка объектов класса в список их имен, отсортированных по возрасту:
        class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        List<User> users = Arrays.asList(new User("Alice", 30), new User("Bob", 25), new User("Charlie", 35));
        List<String> sortedNames = users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .map(User::getName)
                .collect(Collectors.toList());
        System.out.println(sortedNames);


//        Нахождение суммы чисел, кратных 3 и 5, из списка чисел:
        int sumMultiplesOf3And5 = numbers.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumMultiplesOf3And5);


//        Получение списка слов, содержащих только уникальные символы, из списка строк:
        List<String> uniqueCharWords = words.stream()
                .filter(word -> word.chars().distinct().count() == word.length())
                .collect(Collectors.toList());
        System.out.println(uniqueCharWords);


    }
}