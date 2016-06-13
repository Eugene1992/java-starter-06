package lesson_06;

public class BreakContinueExamples {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                break;
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 100; i++) {
            if (i == 37) {
                break;
            }
            System.out.print(i + " ");
        }

        for (int i = 0, j = 10; i < 100 || j < 20; i++, j = j + 2) {
            System.out.println(j + " " + i);
        }
    }
}
