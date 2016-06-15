package lesson_09;

public class ForEachExample {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 4, 3, 12, 7, 17};
   /*   arr[0] = 6;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 12;
        arr[4] = 7;
        arr[5] = 17;
   */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        /*for (int i = 0; i < arr.length; i++) {
            int anArr = arr[i];
            System.out.print(arr[i] + " ");
        }*/
        System.out.println();

        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
