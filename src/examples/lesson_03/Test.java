package lesson_03;

import java.util.Scanner;

/**
 * Created by Student on 09-Jun-16.
 */
public class Test {
    public static void main(String[] args) {
        int a = 55;
        int b = 14;
        int c = 18;

        // || = OR
        // && = AND
        if ((a > 10 && a < 20) || (a > 50 && a < 100)) {
            System.out.println(a);
        }

        /* Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
        промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
        Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
        выводится соответствующее сообщение. */

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
    }
}
