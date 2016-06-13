package hw01;

/**
 * Created by admin on 13.06.2016.
 */
public class HW00 {
    public static void main(String[] args) {

        int a = 10;
        int b;
        if (a > 5) {
            if (a < 10) {
                b = 50;
            } else {
                b = 100;
            }
            b = (a > 5) ? (a < 10) ? 50 : 100 : 100;
            System.out.println(b);
        }

    }
}