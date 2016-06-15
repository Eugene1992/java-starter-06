package lesson_09;

/**
 * Created by Student on 15-Jun-16.
 */
public class ArraysExamples {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 6;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 12;
        arr[4] = 7;
        arr[5] = 17;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }
}
