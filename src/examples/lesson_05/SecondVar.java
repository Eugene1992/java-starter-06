package lesson_05;

/**
 * Created by Student on 10-Jun-16.
 */
public class SecondVar {
    public static void main(String[] args) {
        int z = 5;
        int s = 15;
        int x = 115;
        int y = 1115;

        if (z > s && z > x && z > y){
            if (s > x && s > y) {
                System.out.println(s);
            } else
            if (x > s && x > y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        } else if (s > z && s > x && s > y){
            if (x > z && x > y) {
                System.out.println(x);
            } else
            if (y > z && y > x) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        } else if (x > z && x > y && x > s){
            if (z > s && z > y) {
                System.out.println(z);
            } else
            if (y > z && y > s) {
                System.out.println(y);
            } else {
                System.out.println(s);
            }
        } else {
            if (z > s && z > x) {
                System.out.println(z);
            } else
            if (x > z && x > s) {
                System.out.println(x);
            } else {
                System.out.println(s);
            }
        }
    }
}
