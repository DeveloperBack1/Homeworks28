package homework3009;


////Задание 1: Фильтрация списка целых чисел на нечетные числа
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
////Задание 2: Преобразование списка строк в список чисел
//List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
//
////Задание 3: Суммирование списка чисел
//List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
////Задание 4: Определение максимального значения в списке
////Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистре
//
////Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
//List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
//
////Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту
//List<Person> people = Arrays.asList(new Person("John", 25), new Person("Alice", 22), new Person("Bob", 30));
//
////Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел
////Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainAufgabe3 {

    public static void main(String[] args) {

//        1. Фильтрация списка целых чисел на нечетные числа

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Нечетные числа: " + oddNumbers);

//Задание 2: Преобразование списка строк в список чисел

        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numberList = strings.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println("Список чисел: " + numberList);

//        Задание 3: Суммирование списка чисел

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма чисел: " + sum);

//        4. Определение максимального значения в списке

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5);
        int max = numbers2.stream()
                .max(Integer::compare)
                .orElse(Integer.MIN_VALUE);
        System.out.println("Максимальное значение: " + max);

//        5. Фильтрация списка строк на те, которые начинаются с определенной
//        буквы и преобразование их в верхний регистр

        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "avocado");
        List<String> filteredWords = words.stream()
                .filter(word -> word.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Слова на 'a' в верхнем регистре: " + filteredWords);

//        6. Получение списка уникальных слов из списка строк, длина которых больше 4 символов

        List<String> words1 = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi", "cherry", "kiwi");
        List<String> uniqueWords = words1.stream()
                .filter(word -> word.length() > 4)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Уникальные слова длиной больше 4 символов: " + uniqueWords);

//        7. Преобразование списка объектов класса в список их имен, отсортированных по возрасту

        class Person {
            String name;
            int age;

            public Person(String name, int age) {
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

        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 22),
                new Person("Bob", 30)
        );

        List<String> sortedNames = people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println("Имена, отсортированные по возрасту: " + sortedNames);

//        8. Нахождение суммы чисел, кратных 3 и 5, из списка чисел

        List<Integer> numberss = Arrays.asList(1, 3, 5, 15, 18, 20, 25);
        int sumMultiplesOf3And5 = numberss.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма чисел, кратных 3 и 5: " + sumMultiplesOf3And5);

//        9. Получение списка слов, содержащих только уникальные символы, из списка строк

        List<String> wordss = Arrays.asList("apple", "banana", "cat", "dog", "racecar");
        List<String> uniqueCharWords = wordss.stream()
                .filter(word -> word.chars().distinct().count() == word.length())
                .collect(Collectors.toList());
        System.out.println("Слова с уникальными символами: " + uniqueCharWords);



    }
}


