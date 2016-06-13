package hw03;

import java.util.Scanner;

/**
 * Created by Shpakovski on 09.06.2016.
 */
public class HW03 {
    public static void main(String [] args) {

       /* Задание 1
        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
                либо сообщать, что корней нет.*/
        System.out.println("Задание 1:");

        double a, b, c;
        a = 3.1415;
        b = 1.618;
        c = 1.4142;



        System.out.println("Задание 4");

/*

        Задание 4
        Ииспользуя цикл for, вывести на экран все числа от 0 до 1000, которые деляться нацело на 3.
*/
        for (int i = 0; i < 1000; i++){
            if (i % 3 ==0)
                System.out.println(i);
        }





    }
}
