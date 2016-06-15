package lesson_09;

public class MethodsOverload {
    public static void main(String[] args) {
        System.out.println(getIntervalSum(2, 4));
        System.out.println(getIntervalSum(3.0, 6.0));
    }

    static int getIntervalSum(int start, int end){
        int sum = 0;
        for (; start < end; start++) {
            sum = sum + start;
        }
        return sum;
    }

    static double getIntervalSum(double start, double end){
        double sum = 0;
        for (; start < end; start++) {
            sum = sum + start;
        }
        return sum;
    }

    static int getIntervalSum(int start, int end, int step){
        int sum = 0;
        for (; start < end; start = start + step) {
            sum = sum + start;
        }
        return sum;
    }

    static void someMethod(int i, String s){

    }

    static void someMethod(int i, String s, long l){

    }

    static void someMethod(String s, int i){

    }
}
