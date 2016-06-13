package lesson_06;

public class BinaryConverter {
    public static void main(String[] args) {
        int i = 123;
        String result = "";

        while (true){
            if (i == 1) {
                result = 1 + result;
                break;
            }
            result = i % 2 + result;
            i = i / 2;
        }

        System.out.println(result);
    }
}
