package hw01;

/**
 * Created by admin on 14.06.2016.
 */
public class HW05 {
    public static void main(String[] args){
        toReturnRows(10, "Cubalibre");
        getNewSequense(1000, 1030, 3);
        toSequenseRows(55);
        getReturnBack(1, 5);
    }

    public static void toReturnRows(int start, String str){
        for(int i = 0; i < start; i++){
            System.out.print(str + " " + start + " ");
        }
    }

     /*  Создайте программу, выводящую на экран все четырёхзначные числа последовательности
         1000 1003 1006 1009 1012 1015 ….*/
    public static void getNewSequense(int start, int end, int step){
        for( int i = start; i < end; i = i + step){
            System.out.print(i + "  ");
        }
    }

     /*Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/

    public static void toSequenseRows(int cat){
        for(int i = 1; i < cat; i= i + 2){
            System.out.println(i +" ");
        }
    }

    /*Метод принимает два числа, начало и конец интервала и возвращает сумму всех чисел в этом интервале*/

    public static int getReturnBack(int start, int end){

        int  sum = 0;
        for( int i = start; i < end; i = start++){
            sum = sum + start;
        }
        return sum;




    }
}
