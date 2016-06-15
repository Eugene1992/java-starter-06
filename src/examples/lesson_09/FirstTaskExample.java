package lesson_09;

/**
 * Created by Student on 15-Jun-16.
 */
public class FirstTaskExample {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 7, 12, 54, 34, 67, 23, 2, 123, 67};

        printPairNumsOfArray(arr);
    }

    /* 1. Вывести в консоль все парные числа одномерного массива */
    static void printPairNumsOfArray(int[] array){
        /*for (int num : array){
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }*/
        /*int i = 0;
        while (i < array.length){
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }*/
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        /* 2. Вывести все числа одномерного массива в обратном порядке */

    }
}
