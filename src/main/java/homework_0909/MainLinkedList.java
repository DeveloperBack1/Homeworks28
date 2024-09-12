package homework_0909;

import java.util.LinkedList;
import java.util.ListIterator;

public class MainLinkedList {
    public static void main(String[] args) {
        // Создаем LinkedList и добавляем элементы
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(4);
        linkedList.add(45);
        linkedList.add(20);
        linkedList.add(23);

        // Печатаем список
        System.out.println("Список: " + linkedList);

        // Выводим элементы в обратном порядке
        System.out.print("Элементы в обратном порядке: ");
        printInReverseOrder(linkedList);

        ListIterator<Integer> iterator = linkedList.listIterator();
        int produkt = 1;

        while (iterator.hasNext()) {
            produkt *= iterator.next();
        }
        System.out.println();
        System.out.println("Произведение всех элементов: " + produkt);

        removeDuplicatesManual(linkedList);

        // Печатаем результат
        System.out.println("Список без дубликатов: " + linkedList);


        ListIterator<Integer> iterator1 = linkedList.listIterator();
        while (iterator1.hasPrevious()) {
            System.out.print(iterator1.previous() + " ");
        }

        int max = linkedList.getFirst(); // Инициализируем максимальное значение первым элементом списка

        for (int num : linkedList) {
            if (num > max) {
                max = num;
            }

        }
        System.out.println("Максимальный элемент: " + max);


        System.out.println("Список до замены: " + linkedList);

        replaceMultiplesOfThreeWithZero(linkedList);

        System.out.println("Список после замены: " + linkedList);

    }


        public static void printInReverseOrder (LinkedList < Integer > list) {
            ListIterator<Integer> iterator = list.listIterator(list.size());

            // Идем к началу списка и печатаем элементы
            while (iterator.hasPrevious()) {
                System.out.print(iterator.previous() + " ");
            }
        }



        public static void replaceMultiplesOfThreeWithZero (LinkedList < Integer > list) {
            ListIterator<Integer> iterator = list.listIterator();

            while (iterator.hasNext()) {
                int current = iterator.next();
                if (current % 3 == 0) {
                    iterator.set(0); // Заменяем элемент на 0
                }
            }

        }

    public static void removeDuplicatesManual(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--; // Уменьшаем индекс j, так как после удаления элементы смещаются
                }
            }
        }
    }
        }







