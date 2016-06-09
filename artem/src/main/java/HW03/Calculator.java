package HW03;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Shpakovski on 09.06.2016.
 */
public class Calculator {
    public static void main(String [] args){


        /*  Задание 2
        Используя IntelliJ IDEA, создайте класс Calculator.
        Напишите программу - консольный калькулятор.
                Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
        Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
        Выведите на экран результат выполнения арифметической операции.
                В случае использования операции деления, организуйте проверку попытки деления на ноль.
                И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
        пользователя.*/

        //get first number
        Scanner scann = new Scanner(in);
        int x, y = 0;

        String s = new String();


        System.out.println("Enter first number:");
        x = scann.nextInt();

        // get second number
        System.out.println("Emter second number:");
        y = scann.nextInt();

        System.out.println("Enter choice: \n1.- \n2.+ \n3./ \n4.*");
        System.out.println("Choose your destiny: ");

        int ch = scann.nextInt();

        switch(ch){
            case '-':
                System.out.println("result =" + (x - y));

        }


    }
}
