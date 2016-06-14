package hw01;

/**
 * Created by admin on 13.06.2016.
 */
public class HW04 {
    public static void main(String[] args) {

        int i = 281;
        String result = "";
        while (true) {
            if (i <= 7)
                result = i + result;
            if (i <=7) {
                result = 1 + result;
                break;
            }
            result = i % 8 + result;
            i = i / 8;
        }
        System.out.println("i =" + result);

        System.out.println(result);


        /*Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/

        for (int a = 0; a < 100; a++) {
            if (a == 55) {
                break;
            }
            System.out.println(a + " ");
        }
        for (int a = 0, d = 10; a < 100 || d < 20; a++, d = d + 2) {
            System.out.println(d + " " + a);
        }
        }
    }