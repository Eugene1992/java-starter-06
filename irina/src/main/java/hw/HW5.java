package hw;

public class HW5 {
    public static void main(StringClass[] args) {

        int [] arr = new int[]{100, -23, 63, 0, -78, 66, 89, 100, 27, -27, 44};
        /*getArray(arr);
        getArrayFromTheEnd(arr);
        getHalfArray(arr);
        getHalfFromTheEnd(arr);
        getSum(arr);
        getAverage(arr);
        getMinAndMaxValue(arr);
        getReplaceOnZiro(arr);
        getSameNumbers(arr);
        getCopy(arr);
        getHalfPolov(arr);
        getInvert(arr);
        getReplaceMinAndMaxValue(arr);
        getIndexPozitivAndSumNegativ(arr);
        getToZiro(arr);*/
        getReplaceValue(arr);



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

    public static void getCopy (int [] arr){

        int num = 0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr [i] == arr [j]){
                    num ++;
                }

            }
            num--;
        }
        num = num / 2;
        System.out.print(num + " ");
        System.out.println();
    }

    /*10. Поменять минимальное и максимальное числа в массиве местами*/

    public  static void getReplaceMinAndMaxValue (int [] arr){

        int min = arr [0];
        for (int i = 0; i < arr.length ; i++) {
            if ( arr [0] > arr [i]){
                arr [0] = arr [i];
                min = arr [0];
            }

        }
        int max = arr [0];
        for (int i = 0; i < arr.length ; i++) {
            if ( arr [0] < arr [i]){
                arr [0] = arr [i];
                max = arr [0];
            }

        }
        int replace = 0;
        replace = min;
        min = max;
        max = replace;

        System.out.println("min :" + min);
        System.out.println("max :" + max);
    }

    /*11. Инвертировать массив*/

    public static void getInvert (int [] arr){

        for (int i = 0; i < arr.length ; i++) {
            if (arr [i] > 0 || arr [i] < 0 ){
                arr [i] = -arr [i];
            }
            System.out.print(arr [i] + " ");

        }
        System.out.println();

    }

    /*12. Вывести в консоль половину массива, среднеарифметическое которых является наибольшим*/

    public  static void getHalfPolov ( int [] arr){

        int firstHalfSum = 0;
        int firstHalfAvg = 0;
        for (int i = 0; i < arr.length / 2 ; i++) {

            firstHalfSum = firstHalfSum + arr[i];
        }
        firstHalfAvg = firstHalfSum / (arr.length / 2);

        int secondHalfSum = 0;
        int secondHalfAvg = 0;
        for (int i = arr.length /2; i < arr.length  ; i++) {
            secondHalfSum = secondHalfSum + arr[i];
        }
        secondHalfAvg = secondHalfSum /(arr.length / 2);
        System.out.println(firstHalfAvg);
        System.out.println(secondHalfAvg);
        if (firstHalfAvg > secondHalfAvg) {
            System.out.println(firstHalfAvg);
        } else {
            System.out.println(secondHalfAvg);
        }

    }

    /*13. Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве*/

    public static void getIndexPozitivAndSumNegativ(int [] arr) {

        int sumNegativ = 0;
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i] > 0){
                System.out.print(i + " ");
            }
            if (arr[i] < 0){
                sumNegativ = sumNegativ + arr[i];
            }
        }
        System.out.println();
        System.out.print(sumNegativ + " ");



    }

    /*14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.*/

    public static void getToZiro(int [] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr [i] <= 0){
                System.out.print(arr [i] + " ");
            }

        }

    }

    /*15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.*/

    public static void getReplaceValue(int [] arr){
        int maxValue1 = arr [1];
        int maxValue2 = arr [2];
        int replaceMaxValue1 = arr [0];
        int replaceMaxValue2 = arr [arr.length -1];

        for (int i = 0; i < arr.length ; i++) {
            if (arr [1] < arr [i]){
                arr [1] = arr [i];
                maxValue1 = arr [1];
            }
            maxValue1 = replaceMaxValue1;
        }
        for (int i = 0; i < arr.length ; i++) {
            if (arr [2] < arr [i] && arr [i] < maxValue1){
                arr [2] = arr [i];
                maxValue2 = arr [2];
            }
            maxValue2 = replaceMaxValue2;
        }
        System.out.println("Replace on first index = " + maxValue1);
        System.out.println("Replace on max index = " + maxValue2);



    }

}
