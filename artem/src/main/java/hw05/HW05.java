package hw05;

/**
 * Created by Shpakovski on 16.06.2016.
 */
public class HW05 {
    public static void main(String[] args){

        System.out.println("Задание 1: ");

        // 1. Вывести в консоль все парные числа одномерного массива

        int[] arr = new int[]{2, 4, 9, 12, 66, 321, 67, 88, 2, 123};
        printPairNumbers(arr);

        System.out.println("\nЗадание 2: ");

        // 2. Вывести все числа одномерного массива в обратном порядке

        int[] backArray = {3, 5, 7, 8, 34, 23423, 564, 6785, 4211, 78, 234, 123, 321, 4};
        printNubersBackward(backArray);

        System.out.println("\nExercise 3: ");

        // 3. Вывести первую и вторую половину одномерного массива

        halfMassive(backArray);

        // 4. Вывести первую и вторую половину одномерного массива в обратном порядке

        System.out.println("\nExercise 4: ");

        halfMassiveBackward(backArray);

        // 5. Найти сумму всех элементов в массиве

        System.out.println("\nExercise 5: ");

        sumMassive(arr);

        System.out.println("\nExercise 6:" + " ");

        // 6. Найти среднеарифметическое всех чисел массива

        aveMas(arr);
    }

    static void printNubersBackward(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

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

    public static void sumMassive (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array [i];
        }
        System.out.print(sum);
    }

    public static void aveMas (int [] array){
        int ave = 0;
        for (int i = 0; i < array.length ; i++) {
            ave = (ave + array[i]) / ;
        }
        System.out.println(ave);
    }
}


