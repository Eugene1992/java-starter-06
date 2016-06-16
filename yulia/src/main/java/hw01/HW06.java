package hw01;

/**
 * Created by admin on 15.06.2016.
 */
public class HW06 {
    public static void main(String [] args){
        int [] arr = new int[] {5, 8, 6, 12, 4, 20};

        //printReturnNamsOfArray(arr);
        //getLearnNamArray(arr);
        //getNewNamArray(arr);
        //findSumOfArray(arr);
        getAverageNamOfArray(arr);
        getMinAndMaxNamOfArray (arr);
        getChangeToZero (arr);
        getSameNanOfArray (arr);

    }

    static void printReturnNamsOfArray(int[] array) {

        for (int i = array.length - 1; i >= 0; --i) {

            System.out.print(array[i] + " ");
        }
    }

        /*Вывести первую и вторую половину одномерного массива*/

    public static void getLearnNamArray (int [ ] array ){

        for( int i = 0; i < array.length / 2; i++){
            System.out.print(array [i] + " ");
        }
        System.out.println();
        for( int i = array.length / 2; i < array.length; i++){
            System.out.print(array [i] + " ");
        }

    }
     /*Вывести первую и вторую половину одномерного массива в обратном порядке*/

    public static void getNewNamArray (int [ ] array){

        for( int i = array.length - 1; i >= array.length/2; i--){
            System.out.print(array[i] + " ");
        }
        for(int i = array.length/2; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }

    /*Найти сумму все элементов в массиве*/

    public static int findSumOfArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.print("\nsum = " + sum + "\n");
        return sum;
    }

    /*Найти среднеарифметическое всех чисел массива*/

    public static void getAverageNamOfArray (int[] array){
        /*int sum = 0;
        for( int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum / array.length);*/
        System.out.println("average = " + findSumOfArray(array) / array.length);
    }
    /* Найти минимальное и максимальное число в массиве*/

     public static void getMinAndMaxNamOfArray (int[] array){
         int min = array[0];
         for( int i = 0; i < array.length; i++){
             if(min > array[i]){
                 min = array[i];
             }
         }
         System.out.print("Min-" + min);
         System.out.println();

         int max = array[0];
         for(int i = 0; i < array.length; i++){
             if(max < array[i]){
                 max = array[i];
             }
         }
         System.out.print("Max -" + max);
         System.out.println();
     }
    /*Заменить все отрицательные числа в массиве на 0*/

    public static void getChangeToZero (int[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }
    /*Подсчитать одинаковые числа в одномерном массиве*/

    public static void getSameNanOfArray (int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++){
            for (int a = 0; a < arr.length; a++){
                num++;
            }
            num--;
        }
        num = num / 2;
        System.out.print(num);  /* не поняла */


    }


}
