package oop_3;

import java.util.Arrays;

/**
 * Created by Irinka on 03.07.2016.
 */
public class Array {
    public static void main(String[] args) {
       int []arr = new int[]{23, 12, 28, 89};
       /*String []arr2 = new String[]{};
        arr2[0] = "Irina ";
        arr2[1] = "Yulia ";
        arr2[2] = "Eugene";*/

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.equals(arr, arr));
        System.out.print(arr.length);

        //System.out.println(arr2[0] + arr2[1] + arr2[2]);
    }
}
