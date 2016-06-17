package Classwork;

import java.util.Scanner;

/**
 * Created by Student on 6/15/2016.
 */
public class Methods2 {
    public static void main(String[] args) {
        System.out.println(getAverage(3));

    }

    static double getInputNum (){
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextInt();
        return i;
    }

    static double getAverage (double num) {
        double sum = 0;
        for (double i = 0.0; i < num; i = i + 2) {
            sum = sum + getInputNum();
        }
        return sum / num;
    }
}

