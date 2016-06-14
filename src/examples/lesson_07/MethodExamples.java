package lesson_07;

/**
 * Created by Student on 14-Jun-16.
 */
public class MethodExamples {
    public static void main(String[] args) {
        int i1 = 12;
        int i2 = 21;

        System.out.println("i1 = " + toBinaryString(i1));
        System.out.println("i2 = " + toBinaryString(i2));

        System.out.println(toBinaryString(123));

        String mainResult = toBinaryString(123);
        System.out.println(mainResult);

    }

    static String toBinaryString(int num){
        String result = "";
        while (true){
            if (num == 1) {
                result = 1 + result;
                break;
            }
            result = num % 2 + result;
            num = num / 2;
        }
        return result;
    }

    static void printThreeTimeHello(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
        }
    }
}
