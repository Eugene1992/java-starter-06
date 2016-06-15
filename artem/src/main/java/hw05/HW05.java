package hw05;

/**
 * Created by Shpakovski on 16.06.2016.
 */
public class HW05 {
    public static void main(String[] args){

        System.out.println("Задание 1: ");

        // 1. Вывести в консоль все парные числа одномерного массива

        int[] arr = new int[]{2, 4, 9, 12, 66, 321, 67, 88, 2, 123, 67};
        printPairNumbers(arr);

        System.out.println("\nЗадание 2: ");

        // 2. Вывести все числа одномерного массива в обратном порядке

        int[] backArray = {3, 5, 7, 8, 34, 23423, 564, 6785, 4211, 78, 234, 123, 321, 4};
        printNubersBackward(backArray);

        // 3. Вывести первую и вторую половину одномерного массива



    }

    static void printNubersBackward(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printPairNumbers(int[] array){

        for (int i = 0; i < array.length ; i++) {
            if (array [i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }

        int i = 0;

/*        for (int num : array){
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }*/
        }

}


