package Classwork;

/**
 * Created by Student on 6/13/2016.
 */
public class PoHW04 {
    public static void main(String[] args) {

/*        System.out.println("Task 1:");
        for (int n = 1000; n < 10000; n = n + 3) {
            System.out.println(n + " ");*/

        String result = "";

        int i = 321;
        while (true){
            if (i ==0){
                result = result +1;
                break;
            }
            result = i % 2 + result;
            i = i / 2;

            }
        System.out.println(result);
        }

}
