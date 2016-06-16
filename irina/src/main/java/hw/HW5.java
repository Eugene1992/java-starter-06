package hw;

public class HW5 {
    public static void main(String[] args) {

        int [] arr = new int[]{};
        /*getArray(arr);
        getArrayFromTheEnd(arr);
        getHalfArray(arr);
        getHalfFromTheEnd(arr);
        getSum(arr);
        getAverage(arr);*/
        getMinAndMaxValue(arr);
        /*getReplaceOnZiro(arr);
        getSameNumbers(arr);*/


    }

    /*1. Вывести в консоль все парные числа одномерного массива*/
    public static void getArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr [i] + " ");
            }

        }
        System.out.println();

    }
    /*2. Вывести все числа одномерного массива в обратном порядке*/
    public static void getArrayFromTheEnd(int arr[]){

        for (int i = arr.length - 1; i >=0 ; i--) {
            System.out.print(arr [i] + " ");
        }
        System.out.println();
    }

    /*3. Вывести первую и вторую половину одномерного массива*/
    public static void getHalfArray(int arr []){

        for (int i = 0; i <= arr.length / 2 ; i++) {

            System.out.print( arr [i] + " ");
        }

        System.out.println();

        for (int i = arr.length /2; i < arr.length ; i++) {

            System.out.print( arr [i] + " ");

        }
        System.out.println();
    }
    /*4. Вывести первую и вторую половину одномерного массива в обратном порядке*/

    public static void getHalfFromTheEnd (int [] arr){

        for (int i = arr.length -1; i > arr.length / 2 ; i--) {

            System.out.print( arr [i] + " ");

        }
        System.out.println();

        for (int i = arr.length / 2; i >= 0 ; i--) {

            System.out.print( arr [i] + " ");

        }
        System.out.println();
    }

    /*5. Найти сумму все элементов в массиве*/
    public static void getSum (int [] arr){

        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        System.out.print(sum);
        System.out.println();
    }

    /*6. Найти среднеарифметическое всех чисел массива*/

    public static  void getAverage (int [] arr){

        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length ; i++) {

            sum = sum + arr [i];
        }
        average = sum / arr.length;
        System.out.print(average);
        System.out.println();
    }

    /*7. Найти минимальное и максимальное число в массиве*/
    //???????????????????????????????????????????????????
    //???????????????????????????????????????????????????
    public static void getMinAndMaxValue (int [] arr){
        if (arr.length == 0) {
            System.out.println("Empty array");
            return;
        }
        int min = arr [0];
        for (int i = 0; i < arr.length ; i++) {
            if (min > arr [i]) {
                min = arr[i];
            }
        }
        System.out.print("Min - " + min);
        System.out.println();

        int max = arr [0];
        for (int i = 0; i < arr.length ; i++) {
            if (max < arr [i]) {
                max = arr[i];
            }
        }
        System.out.print("Max - " + max);
        System.out.println();

    }


    /*8. Заменить все отрицательные числа в массиве на 0*/

    public static void getReplaceOnZiro (int [] arr){

        for (int i = 0; i < arr.length ; i++) {

            if (arr [i] < 0){
                arr [i] = 0;
            }
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }


    /*9. Подсчитать одинаковые числа в одномерном массиве*/

    public static void getSameNumbers (int [] arr){

        int num = 0;
        for (int i = 0; i < arr.length ; i++) {
            int sameNum = arr [i];
            if ( sameNum == arr[0]){
                num++;

            }

        }
        System.out.print(num);
    }



}
