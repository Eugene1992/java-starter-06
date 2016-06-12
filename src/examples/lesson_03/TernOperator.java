package lesson_03;

/**
 * Created by Student on 09-Jun-16.
 */
public class TernOperator {
    public static void main(String[] args) {
        int a = 10;
        int b;



        if (a > 5) {
            if (a < 10) {
                b = 50;
            } else {
                b = 100;
            }
        } else {
            b = 100;
        }

        // b = (condition) ? if true : if false;
           b =    a > 5    ?    50   :   100;

        b = a > 5 ? a < 10 ? 50 : 100 : 100;

        System.out.println(b);


    }
}
