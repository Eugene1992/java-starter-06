package hw03;

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
        Scanner scann = new Scanner(in); // Создаем обьект для получения числа посредством ввода с клавиатуры
        int x, y; // Две переменные, которыми мы будем оперировать
        String s; // Переменнатя типа Строка для введенной математической операции

        System.out.println("Enter first number:");
        x = scann.nextInt(); // Получаем первое число с консоли

        // get second number
        System.out.println("Enter second number:");
        y = scann.nextInt(); // Получаем Второе число с консоли

        System.out.println("Enter choice: \n1.- \n2.+ \n3./ \n4.*");
        /*

        Enter choice:
        1. -
        2. +
        3. /
        4. *

        */
        System.out.println("Choose your destiny: ");

        int ch = scann.nextInt();
        // String ch = scann.next(); // Получаем строку с консоли

        switch(ch){
            case '-':
                System.out.println("result =" + (x - y));
                break;
            case '+':
                System.out.println("result =" + (x + y));
                break;
            case '/':
                System.out.println("result =" + (x / y));
                break;
            case '*' :
                System.out.println("result =" + (x * y));
                break;
            default :
                System.out.println("I don't know you");

        }


    }
}
