package hw01;

/**
 1. Создать четыре целочисленные переменные типов byte, short, int, long.
 2. Инициализировать переменную типа byte результатом суммы двух любых чисел
 3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
 4. Инициализировать переменную типа int результатом деления двух любых чисел
 5. Инициализировать переменную типа long результатом умножения двух любых чисел
 6. Передать перменной типа byte результат суммы двух переменной типа byte
 7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
 8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
 9. Поменять значения двух целочисленных переменных используя третью
 10. Поменять значения двух переменных без использования третей
 */
public class HW01 {
    public static void main(String[] args) {
        /* 1. Создать четыре целочисленные переменные типов byte, short, int, long. */

        /* byte */
        byte b;
        b = 10;
        byte b1 = 5, b2 = 15;
        byte b3 = 4, b4 = 12;
        byte b5 = 20 + 5;
        System.out.println(b5);
        byte b7 = (byte)(b3+b1);
        System.out.println(b7);

        /* short */
        short s = 180;
        short s1 = 180 + 15;
        System.out.println(s1);
        short s3 = 180 - 20;
        System.out.println(s3);
        short s4 = 160 - 50;
        System.out.println(s4);

        /* int */
        int i = 15;
        int i1 = 5, i2 = 8, i3 = 20;
        int result = i3 + i / 2;
        System.out.println(result);
        int result1 = i1 - i3 *2;
        System.out.println(result1);

        /* long */
        long l = 102587458965L;
        System.out.println(l);
        long l1 = 52487 * 548;
        System.out.println(l1);

        /* Передать переменной типа byte результат суммы двух переменных типа short,
        деленных на третью переменную типа byte */

        byte b6 = (byte)((s1+s3)/b);
        System.out.println(b6);

        /* Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte */

        int i4 = (int)((s1/s4)*(b5/b));
        System.out.println(i4);

        /* Поменять значения двух целочисленных переменных используя третью */

        int a = 2;
        int f = 4;
        int c = a;
        a = f;
        f = c;
        System.out.println(f);

        /* Поменять значения двух переменных без использования третей */

        a = a + f;
        a = a - f;
        f = a - f;
        System.out.println(a);

        /* Задачка */

        int g = 4;
        int g0;
        int g1;
        int g2;
        int g3;

        g0 = g % 2;
        g = g / 2;
        g1 = g % 2;
        g = g / 2;
        g2 = g % 2;
        g = g /2;
        g3 = g % 2;
        g = g / 2;

        System.out.println(g3+""+g2+""+g1+""+g0);

    }
}
