package hw04;

/**
 * Created by Shpakovski on 13.06.2016.
 */
public class HW04 {
    public static void main(String[] args){
        System.out.println("Exercise 1:");

        // 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

        for (int i = 1000; i < 10000; i += 3){
            System.out.print(i + " ");
        }

        System.out.println("\n \nExercise 2:");

        // 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

        for (int o = 1; o < 100; o += 2){
            System.out.print(o + " ");
            if (o == 55) break;
        }

        System.out.println("\n \nExercise 3:");

        // 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

        for (int q = 90; q >= 0; q -= 5){
            System.out.print(q + " ");
        }

        System.out.println("\n \nExercise 4:");

        // 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

        int q = 2;
        for (int p = 1; p <= 20; p++){
            while (p <= 20) break; {
                System.out.print(q + " ");
                q = q * 2;
        }
        }

        System.out.println("\n \nExercise 5:");

        // 5. Выведите на экран первые 20 членов последовательности Фибоначчи.

        int fibonacci;
        for (int p = 1; p <= 20; p++){
            while (p <= 20) break; {
                System.out.println();
            }
        }
    }

}
