package Classwork;

/**
 * Created by Student on 6/10/2016.
 */
public class Classwork1 {
    public static void main(String [] args) {
        System.out.println("Cycle examples:");


        for (int artem = 0; artem < 100; artem++){
            if (artem % 3 == 0) {
                System.out.println(artem + " ");
            }
        }

        int i = 0;
        while (i <100) {
            if (i % 3 ==0) {
                System.out.println(i + " ");
            }
            i++;

            System.out.println();
             int k = 0;
            do {
                k++;
            }while (k<100);
        }
    }
}