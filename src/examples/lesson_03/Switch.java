package lesson_03;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int a = 2;

        if (a == 1) {
            System.out.println("a == 1");
        }
        if (a == 2) {
            System.out.println("a == 2");
        }
        if (a == 3) {
            System.out.println("a == 3");
        }
        if (a == 4) {
            System.out.println("a == 4");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first digit:");
        int i1 = scanner.nextInt();

        //String s1 = "10dssds0";
        System.out.println("Enter math operation:\n1) *\n2) /\n3) +\n4) -");

        String s = scanner.next();


        switch (s){
            case "*": {
                System.out.println("Enter second digit:");
                int i2 = scanner.nextInt();
                System.out.println(i1 * i2);
                break;
            }
            case "/": {
                System.out.println("Enter second digit:");
                int i2 = scanner.nextInt();
                System.out.println(i1 / i2);
                break;
            }
            case "+": {
                System.out.println("Enter second digit:");
                int i2 = scanner.nextInt();
                System.out.println(i1 + i2);
                break;
            }
            case "-": {
                System.out.println("Enter second digit:");
                int i2 = scanner.nextInt();
                System.out.println(i1 - i2);
                break;
            }
            default:{
                System.out.println("You wrote incorrect math operation value! Try again...");
            }
        }
        System.out.println("End");
        //int k = Integer.parseInt("10");
    }
}
