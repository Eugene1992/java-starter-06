
public class HW1 {
    public static void main (String[] args)
    {
        // 1. Создать четыре целочисленные переменные типов byte, short, int, long.

        byte a;
        short b;
        int c;
        long d;

        // 2. Инициализировать переменную типа byte результатом суммы двух любых чисел
        a = 100 + 20;
        System.out.println(a);

        // 3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
        b = 2650 - 268;
        System.out.println(b);

        // 4. Инициализировать переменную типа int результатом деления двух любых чисел
        c = 800 / 4;
        System.out.println(c);

        // 5. Инициализировать переменную типа long результатом умножения двух любых чисел
        d = 70 * 50;
        System.out.println(d);

        // 6. Передать перменной типа byte результат суммы двух переменной типа byte
        byte m = 10, n = 20, s;
        s = (byte)(m + n);
        System.out.println(s);

        // 7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        short i = 7, j = 8;
        byte k, k1 = 3;
        k = (byte)((i + j) / k1);
        System.out.println(k);


        //8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        int result;
        short h = 90, g = 3;
        byte x = 50, y = 10;
        result = (h / g) * (x / y);
        System.out.println(result);

        // 9. Поменять значения двух целочисленных переменных используя третью
        int p = 6, p1 = 8, p2 = 10;
        p2 = p; //6
        p = p1; //8
        p1 = p2;
        System.out.println(p);
        System.out.println(p1);

        // 10. Поменять значения двух переменных без использования третей
        int s1 = 20, s2 = 2;
        s1 = s1 / 10;
        s2 = s2 * 10;
        System.out.println(s1);
        System.out.println(s2);

        /*---------------------------------------------------- BONUS -------------------------------------------------------------
                Дано число от 0 до 127 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
        систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условия(if)! */

        int t = 120, t0 = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0;

        t0 = t % 2;
        t = t / 2;
        t1 = t % 2;
        t = t / 2;
        t2 = t % 2;
        t = t / 2;
        t3 = t % 2;
        t = t / 2;
        t4 = t % 2;
        t = t / 2;
        t5 = t % 2;
        t = t / 2;
        t6 = t % 2;
        t = t / 2;
        t7 = t % 2;
        t = t / 2;

        System.out.print(t7);
        System.out.print(t6);
        System.out.print(t5);
        System.out.print(t4);
        System.out.print(t3);
        System.out.print(t2);
        System.out.print(t1);
        System.out.print(t0);





























    }
}
