package oop_10;

import java.util.LinkedList;

/**
 * Created by Student on 7/6/2016.
 */
public class ArraysTimeTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            new Object();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
