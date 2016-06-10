package hw02;

/**
 * Created by Shpakovski on 09.06.2016.
 */
public class hw02 {
    public static void main(String[] args) {
        /* Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли  целое число, чётным либо нечётным. */

        int a = 123;
        System.out.println("Задание 2:" + "\n");

        if ((a % 2) == 0) {
            System.out.println("Число 123 - " + "четное" + "\n");
        } else {
            System.out.println("Число 123 - " + "нечетное" + "\n");
        }

        /* Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45. */

        int b = 100;
        int c = 111;

        if ((a - c) >= c) {
            System.out.println("\n" + "Задание 3:" + "\n" + "число 123 ближе к числу 111" + "\n");
        } else {

            System.out.println("\n" + "Задание 3:" + "\n" + "число 100 ближе к числу 111" + "\n");
        }


        /*Задание 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные).*/

        int d, e, f;
        d = 5;
        e = 6;
        f = 7;

        System.out.println("Задание 4:" + "\n");

        if (d > e && d > f) {
            System.out.println("maxValue = " + d + "\n");
        } else if (e > d && e > f) {
            System.out.println("maxValue = " + e + "\n");
        } else {
            System.out.println("maxValue = " + f + "\n");
        }

        /* Задание 5
        Задано четыре переменных, найти и вывести на экран вторую по величине. */

        int s, x, y, z;
        s = 29;
        x = 30;
        y = 24;
        z = 23;

        System.out.println("Задание5:" + "\n");

        if ((s > x && s > y && s < z) || (s > x && s < y && s > z) || (s < x && s < y && s > z)) {
            System.out.println("secondValue = s = " + s);
        }
        if ((x > s && x > y && x < z) || (x > s && x < y && x > z) || (x < s && x < y && x > z)) {
            System.out.println("secondValue = x = " + x);
        }
        if ((y > s && y > x && y < z) || (y > s && y < x && y > z) || (y < s && y < x && y > z)) {
            System.out.println("secondValue = y = " + y);
        }
        if ((z > s && z > x && z < y) || (z > s && z < x && z > y) || (z < s && z < x && z > y)) {
            System.out.println("secondValue = z = " + z);
        }

    }
}
