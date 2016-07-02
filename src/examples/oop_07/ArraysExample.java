package oop_07;

import java.util.Arrays;

/**
 * Created by Student on 7/2/2016.
 */
public class ArraysExample {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 2, 5, 4};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
