package lesson_05;

public class CycleExamples {
    public static void main(String[] args) {

        for(int i = 0; i < 100; i++){
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int i = 0;
        while (i < 100) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();

        int k = 0;
        do {
            if (k % 3 == 0) {
                System.out.print(k + " ");
            }
            k++;
        } while (k < 100);

    }
}
