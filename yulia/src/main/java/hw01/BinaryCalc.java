package hw01;

/**
 * Created by Student on 6/13/2016.
 */
public class BinaryCalc {
    public static void main(String[] args) {
        int v = 6;
        String result = "";
        while (true) {
            if (v == 1) {
                result = 1 + result;
                break;
            }
            result = v % 2 + result;
            v = v/2;
        }
        System.out.println(result);
    }
}
