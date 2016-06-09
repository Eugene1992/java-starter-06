package hw02;

/**
 * Created by Shpakovski on 09.06.2016.
 */
public class hw02 {
    public static void main(String[] args){
        /* Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли  целое число, чётным либо нечётным. */

        int a = 123;
        System.out.println("Задание 2:" + "\n");

        if ((a % 2) == 0) {
            System.out.println("Число 123 - " + "четное" + "\n");
        }
        else {
            System.out.println("Число 123 - " + "нечетное" + "\n");
        }

        /* Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45. */

        int b = 100;
        int c = 111;

        if ((a - c)  >= c){
            System.out.println("\n" + "Задание 3:" + "\n" + "число 123 ближе к числу 111" + "\n");
        }
        else {

            System.out.println("число 100 ближе к числу 111" + "\n");
        }


        System.out.println("Задание 3:" + "\n");

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
        }
        else if  (e > d && e > f){
            System.out.println("maxValue = " + e + "\n");
        }
        else {
            System.out.println("maxValue = " + f + "\n");
        }

        /* Задание 5
        Задано четыре переменных, найти и вывести на экран вторую по величине. */

        int s, x, y, z;
        s = 10;
        x = 11;
        y = 12;
        z = 13;

        System.out.println("Задание5:" + "\n");

        if (s > x ) {}


    }
}
