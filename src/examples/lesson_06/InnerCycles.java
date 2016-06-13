package lesson_06;

/**
 * Created by Student on 13-Jun-16.
 */
public class InnerCycles {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Start outer");
            for (int j = 0; j < 10; j++) {
                System.out.println("Do inner ");
            }
            System.out.println("End Outer");
        }*/

        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 7) continue outer;
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
