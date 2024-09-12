package homework_0609.task1;

import java.util.Arrays;
import java.util.Random;

public class ArraysOp {

    public static void main(String[] args) {
        int M = 10;
        int[] array = new int [M];
        Random random = new Random();
        for(int i = 0; i < M; i++) {
        array[i] = random.nextInt(100)+1;
        }
        System.out.println("Unser Array: "+Arrays.toString(array));

        int summ = 0;
        for(int i : array) {
            summ+= i;
        }
        System.out.println("Summe von allen Elementen: "+summ);

       int min = array[0];
       for(int i : array) {
           if(i<min){
               min = i;

           }
       }
       System.out.println("Min Element von allen Elementen: "+min);

       int sumOfSquares = 0;
       for(int i : array) {
           sumOfSquares += i*i;
       }

       System.out.println("Sum of Squares von allen Elementen: "+sumOfSquares);

       int max = array[0];
       int secondMax = Integer.MIN_VALUE;
       for(int i : array) {
           if(i>max){
               secondMax = max;
               max = i;
           } else if(i > secondMax && i != max){
              secondMax = i;
           }
       }

       System.out.println("SecondMax Element von allen Elementen: "+secondMax);

        // Höchste ansteigende Reihenfolge:
        int longestIncSeqLength = findLongestIncreasSequence(array);
        System.out.println("Die Länge von grösste ansteigende Reihenfolge: " + longestIncSeqLength);


        System.out.print("Reverse Array: ");
        for (int i = M - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -array[i];
            }
        }
        System.out.println("Array mit geraden negativen Elementen: " + Arrays.toString(array));

        replDuplWithZero(array);
        System.out.println("Array mit Ersatz von Duplikaten auf 0: " + Arrays.toString(array));
    }
    public static int findLongestIncreasSequence(int[] array) {
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }
        return maxLength;
    }
    public static void replDuplWithZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && array[i] != 0) {
                    array[j] = 0;
                }
            }
        }
    }
}
