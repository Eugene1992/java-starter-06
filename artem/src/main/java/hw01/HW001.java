package hw01;

/**
 * Created by Shpakovski on 08.06.2016.
 */
public class HW001 {
    public static void main(String[] args){
        // 1. Создать четыре целочисленные переменные типов byte, short, int, long.

        byte b1 = 1;
        short s1 = 2;
        int i1 = 3;
        long l1 = 32525764785643643L;

        System.out.println("Задание 1: " + "\n" + " b1 = " + b1 + "\n" + " s1 = " + s1 + "\n" + " i1 = " + i1 + "\n" + " l1 = " + l1);

        //2. Инициализировать переменную типа byte результатом суммы двух любых чисел

        byte b2;
        b2 = 4+1;

        System.out.println ("\n" + "Задание 2:" + "\n" + "b2 = " + b2);

        //3. Инициализировать переменную типа short  результатом вычитания двух любых чисел

        short s2;
        s2 = 300-123;

        System.out.println("\n" + "Задание 3:" + "\n" + "s2 = " + s2);

        //4. Инициализировать переменную типа int результатом деления двух любых чисел

        int i2;
        i2 = 60000/456;

        System.out.println("\n" + "Задание 4:" + "\n" + "i2 = " + i2);

        //5. Инициализировать переменную типа long результатом умножения двух любых чисел

        long l2;
        l2 = 4556*123;

        System.out.println("\n" + "Задание 5:" + "\n" + "l2 = " + l2);

        //6. Передать перменной типа byte результат суммы двух переменной типа byte

        byte b3 = (byte) (b1+b2);

        System.out.println("\n" + "Задание 6:" + "\n" + "b3 = " + b3);

        //7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte

        byte b4 = (byte) ((s1+s2)/b3);

        System.out.println("\n" + "Задание 7 " + "\n" + "b4 = " + b4);

        //8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte

        int i3 = (s2/s1)*b4;

        System.out.println("\n" + "Задание 8 " + "\n" + "i3 = " + i3);

        //9. Поменять значения двух целочисленных переменных используя третью

        int a = 12;
        int b = 34;
        int c = 0;

        c = a;
        a = b;
        b = c;


        System.out.println("\n" + "Задание 9:" + "\n" + "a = " + a + "\n" + "b = " + b + "\n");

        //10. Поменять значения двух переменных без использования третей

        int y = 56;
        int z = 78;

        y = y + z; // = 134
        z = y - z; // = 56
        y = y - z; // = 78

        System.out.println("Задание 10:" + "\n" + "y = " + y + "\n" + "z = " + z);


        /* Дано число от 0 до 127 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
        систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условия(if)! Пример:

        byte b = 103;
        ...
        < Ваш код >
        ...
        Вывод в консоль в следующем виде:
        0110 0111

        Важно чтобы вывод включал в себя все разряды! То есть, даже если число 3 в двоичной системе равно 11, вывод в консоль
        должен быть в ввиде 00000011. */

        int x = 123;
        int x0, x1, x2, x3, x4, x5, x6, x7;

        x0 = x%2;

        x = x/2;
        x1 = x%2;

        x = x/2;
        x2 = x%2;

        x = x/2;
        x3 = x%2;

        x = x/2;
        x4 = x%2;

        x =x/2;
        x5 = x%2;

        x = x/2;
        x6 = x%2;

        x = x/2;
        x7 = x%2;

        System.out.println("\n" + "Bonus:" + "\n" + x7 + x6 + x5 + x4 + x3 + x2 + x1 + x0);


    }
}
