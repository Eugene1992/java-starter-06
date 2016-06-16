/**
 * Created by Student on 16-Jun-16.
 */
public class Ira {
    public static void main(String [] args){

        int [] arr = new int []{10, 25, 75, -75, 75, 100, 10, 66, -27, -27};
        ///getCopy(arr);
        //getReplaceMinAndMaxValue(arr);
        //getInvert(arr);
        getHalfPolov(arr);

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
}
