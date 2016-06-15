package hw01;

/**
 * Created by admin on 15.06.2016.
 */
public class HW06 {
    public static void main(String [] args){
        int [] arr = new int[] {5, 8, 6, 12, 4, 20};

         printReturnNamsOfArray(arr);
    }
    static void printReturnNamsOfArray(int[] array){

        for(int i = array.length - 1; i >= 0; --i){

        System.out.println(array[i]);
        }

    }

}
