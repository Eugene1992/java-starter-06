package hw;

/**
 * Created by Irinka on 13.06.2016.
 */
public class HW4 {
    public static void main(String[] args) {
        /*1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….*/

        for (int i = 1000; i < 10000; i += 3){
            System.out.print(i + " ");
        }
        System.out.println();

       /*2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/


        for (int i = 0; i <= 55; i++){
            if (i % 2 != 0)

            System.out.print(i + " ");
        }
        System.out.println();

        /*3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….*/


        for (int i = 90; i > 0; i -= 5 )
        {
            if (i % 2 == 0)
                System.out.print(i + " ");

        }
        System.out.println();


        /*4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….*/

        for (int j = 0; j < 1000; j += 2){
            if (j == 20 * 2) break;
            System.out.print(j + " ");
        }
        System.out.println();


       /* 5. Выведите на экран первые 20 членов последовательности Фибоначчи.*/

        int a = 1;
        int b = 1;
        int c;

        System.out.print( a + " " + b + " ");

        for (int i = 0; i < 18 ; i++) {

            c = a + b;
            a = b;
            b = c;


            System.out.print( c + " ");


        }

    }
}
