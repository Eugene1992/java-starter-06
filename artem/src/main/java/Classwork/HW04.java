package Classwork;

/**
 * Created by Student on 6/13/2016.
 */
public class HW04 {
    public static void main(String[] args) {

/*        System.out.println("Task 1:");
        for (int n = 1000; n < 10000; n = n + 3) {
            System.out.println(n + " ");*/

        String result = "";

        int i = 1224;
        while (true){
            if (i < 16){
                if (i >= 10) {
                    switch (i) {
                        case 10:
                            result = "A" + result;
                            break;
                        case 11:
                            result = "B" + result;
                            break;
                        case 12:
                            result = "C" + result;
                            break;
                        case 13:
                            result = "D" + result;
                            break;
                        case 14:
                            result = "E" + result;
                            break;
                        case 15:
                            result = "F" + result;
                            break;
                    }
                } else {
                    result = i + result;
                    break;
                }
            }
            int cur = i % 16;
                if (cur >= 10) {
                    switch (cur) {
                        case 10:
                            result = "A" + result;
                            break;
                        case 11:
                            result = "B" + result;
                            break;
                        case 12:
                            result = "C" + result;
                            break;
                        case 13:
                            result = "D" + result;
                            break;
                        case 14:
                            result = "E" + result;
                            break;
                        case 15:
                            result = "F" + result;
                            break;
                    }
                } else {
                    result = cur + result;
                }
            i = i / 16;
            }
        System.out.println(result);
        }

}
