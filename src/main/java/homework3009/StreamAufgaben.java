package homework3009;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;




public class StreamAufgaben {

    public static void main(String[] args) {

        // Задача 1: Фильтрация четных чисел и умножение на 2.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenDoubled = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(evenDoubled);

        // Задача 2: Удаление дубликатов из списка строк.
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> uniqueWords = words.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueWords);

        // Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
        List<String> filteredWords = words.stream()
                .filter(w -> w.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredWords);

        // Задача 5: Пропуск первых двух элементов и вывод оставшихся.
        List<String> skipFirstTwo = words.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skipFirstTwo);

        // Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
        List<Integer> largeNumbers = Arrays.asList(45, 60, 70, 30, 90);
        List<Integer> squaresOfLargeNumbers = largeNumbers.stream()
                .filter(n -> n > 50)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaresOfLargeNumbers);

        // Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
        List<String> wordsWithO = words.stream()
                .filter(w -> w.contains("o"))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(wordsWithO);

        // Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(oddNumbers);

        // Задача 9: Получить среднее значение чисел в списке.
        OptionalDouble average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average.orElse(0));

        // Задача 10: Получить строку, объединяющую элементы списка через запятую.
        String joinedWords = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joinedWords);

        // Задача 11: Получить список квадратов чисел из другого списка.
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);

        // Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке.
        List<String> letters = words.stream()
                .flatMap(w -> Arrays.stream(w.split("")))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(letters);

        // Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
        List<String> firstThreeReversed = words.stream()
                .limit(3)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println( firstThreeReversed);


        // Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
        List<String> uniqueAfterSkipping = words.stream()
                .skip(2)
                .distinct()
                .collect(Collectors.toList());
        System.out.println( uniqueAfterSkipping);


        // Задача 15: Фильтрация и сортировка пользователей по возрасту.
        List<User> users = Arrays.asList(
                new User("Alice", 30),
                new User("Bob", 25),
                new User("Charlie", 35)
        );
        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getAge))
                .collect(Collectors.toList());
        sortedUsers.forEach(user -> System.out.println(user.getName() + ": " + user.getAge()));
    }

    // User class for task 15
    static class User {
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
}
