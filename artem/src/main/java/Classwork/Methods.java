package Classwork;

/**
 * Created by Student on 6/14/2016.
 */
public class Methods {

    public static void main(String[] args) {

        printString("Artem", 5);
        printString("Ira", 3);

        printNum(1, 10, 2);

        System.out.println("\n \n" + "Triangle Square = " + triangleSqr(15, 5));
        double d = triangleSqr(15, 2);
    }

    static void printString(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);

        }
    }


    static void printNum(int from, int to, int step) {
        for (; from <= to; from = from + step) {
            System.out.print(from + " ");

        }
    }

    public static double triangleSqr(double a, double h) {
        //System.out.println("\n \n" + "Triangle Square = " + 0.5 * (a * h));
        double square = 0.5 * a * h;
        return square;
    }

    public static int summ(int a, int b){

        return 1;
    }
}
