package hw05;

/**
 * Created by Shpakovski on 16.06.2016.
 */
public class HW05 {
    public static void main(String[] args){

        System.out.println("Задание 1: ");

        int[] arr = new int[]{2, 4, 9, 12, 66, 321, 67, 88, 2, 123};
        printPairNumbers(arr);

        System.out.println("\nЗадание 2: ");

        printNubersBackward(arr);

        System.out.println("\nExercise 3: ");

        halfMassive(arr);

        System.out.println("\nExercise 4: ");

        halfMassiveBackward(arr);

        System.out.println("\nExercise 5: ");

        sumMassive(arr);

        System.out.println("\nExercise 6:" + " ");

        aveMas(arr);
    }

    // 1. Вывести в консоль все парные числа одномерного массива

    static void printNubersBackward(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    // 2. Вывести все числа одномерного массива в обратном порядке

    public static void printPairNumbers(int[] array){

        for (int i = 0; i < array.length ; i++) {
            if (array [i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
        }

        int i = 0;

/*        for (int num : array){
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }*/
        }

    // 3. Вывести первую и вторую половину одномерного массива

    public static void halfMassive (int[] array){
        System.out.print("First half of Massive = ");
       for (int i = 0; i < array.length / 2; i++){
           System.out.print(array[i] + " ");
       }
        System.out.print("\nSecond half of Massive = ");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

/*        for (int i = 0; i < array.length ; i++) {
            if(i < array.length / 2){
                System.out.print(array[i] + " ");
                break;*/

            }

    // 4. Вывести первую и вторую половину одномерного массива в обратном порядке

    public static void halfMassiveBackward (int [] array){
        System.out.print("First half of Massive = ");
        for (int i = array.length - 1; i > array.length / 2; i--){
            System.out.print(array[i] + " ");
        }
        System.out.print("\nSecond half of Massive = ");
        for (int i = array.length / 2; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    // 5. Найти сумму всех элементов в массиве

    public static void sumMassive (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array [i];
        }
        System.out.print(sum);
    }

    // 6. Найти среднеарифметическое всех чисел массива

    public static void aveMas (int [] array){
        int ave = 0;
        int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            sum = sum + array[i];
            ave = sum / ;
        }
        System.out.println(ave);
    }
}


